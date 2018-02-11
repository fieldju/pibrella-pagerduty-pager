package com.fieldju.pager.service;

import com.fieldju.pager.configuration.PagerProperties;
import com.fieldju.pager.model.pagerduty.webhook.v2.Acknowledgement;
import com.fieldju.pager.model.pagerduty.webhook.v2.Assignee;
import com.fieldju.pager.model.pagerduty.webhook.v2.Assignment;
import com.fieldju.pager.model.pagerduty.webhook.v2.Incident;
import com.fieldju.pager.model.pagerduty.webhook.v2.Event;
import com.fieldju.pager.model.pagerduty.webhook.v2.WebhookPayload;
import com.fieldju.pager.model.pagerduty.webhook.v2.WebhookPayloadWrapper;
import com.pi4j.component.button.ButtonPressedListener;
import com.pi4j.component.buzzer.Buzzer;
import com.pi4j.component.light.LED;
import com.pi4j.device.pibrella.Pibrella;
import com.pi4j.device.pibrella.PibrellaLed;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

@Component
public class Pager {

    private final Set<String> activeIncidentsAssignedToPagerOwner = new HashSet<>();

    private final Logger log = LoggerFactory.getLogger(getClass());

    private final ExecutorService triggerProcessor = Executors.newSingleThreadExecutor();
    private final ExecutorService pibrellaStateManager = Executors.newSingleThreadExecutor();
    private final ExecutorService healthcheck = Executors.newSingleThreadExecutor();
    private final AtomicBoolean isHealthy = new AtomicBoolean(true);

    private final PagerProperties pagerProperties;

    @Autowired
    public Pager(PagerProperties pagerProperties,
                 Pibrella pibrella, PagerDuty pagerDuty) {

        this.pagerProperties = pagerProperties;

        final Buzzer buzzer = pibrella.getBuzzer();
        final LED red = pibrella.getLed(PibrellaLed.RED);
        final LED yellow = pibrella.getLed(PibrellaLed.YELLOW);
        final LED green = pibrella.getLed(PibrellaLed.GREEN);

        pibrellaStateManager.execute(() -> {
            while (! Thread.currentThread().isInterrupted()) {
                if (isHealthy.get()) {
                    yellow.off();
                } else {
                    yellow.on();
                }

                if (activeIncidentsAssignedToPagerOwner.isEmpty()) {
                    buzzer.stop();
                    red.off();
                } else {
                    red.on();
                    buzzer.buzz(1000);
                }
                sleep(500, MILLISECONDS);
            }
        });

        pibrella.getButton().addListener((ButtonPressedListener) event -> {
            log.info("button pressed");
            activeIncidentsAssignedToPagerOwner.forEach(pagerDuty::acknowledgeIssue);
            activeIncidentsAssignedToPagerOwner.clear();
        });

        healthcheck.execute(() -> {
            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(5, SECONDS)
                    .readTimeout(5, SECONDS)
                    .writeTimeout(5, SECONDS)
                    .build();

            while (! Thread.currentThread().isInterrupted()) {
                try {
                    Response response = client.newCall(new Request.Builder().url("https://pibrella.fieldju.com/healthcheck").get().build()).execute();
                    isHealthy.set(response.code() == HttpServletResponse.SC_NO_CONTENT);
                    response.close();
                    green.on();
                    sleep(250, MILLISECONDS);
                    green.off();
                } catch (Exception e) {
                    log.error("Failed to check health");
                    isHealthy.set(false);
                }
                sleep(10, SECONDS);
            }
        });
    }

    private void sleep(int amount, TimeUnit timeUnit) {
        try {
            Thread.sleep(timeUnit.toMillis(amount));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void processTriggerAsync(WebhookPayloadWrapper webhookPayloadWrapper) {
        triggerProcessor.execute(() -> processMessages(webhookPayloadWrapper.getMessages()));
    }

    private void processMessages(List<WebhookPayload> messages) {
        messages.forEach(message -> {
            Incident incident = message.getIncident();
            log.info("Received Trigger with type: {} and incident with title: {}, with description: {} and assignees: {}",
                    message.getEvent(),
                    incident.getTitle(),
                    incident.getDescription(),
                    String.join(",", incident.getAssignments().stream()
                            .map(a -> a.getAssignee().getSummary())
                            .collect(Collectors.toList()))
            );
            processMessage(message);
        });
    }

    /**
     * if the incident is not resolved alert
     */
    private void processMessage(WebhookPayload payload) {
        Event event = Event.fromName(payload.getEvent());

        String incidentKey = payload.getIncident().getIncidentKey();

        if (Event.INCIDENT_RESOLVE.equals(event) || hasPagerOwnerAcknowledged(payload.getIncident().getAcknowledgements())) {
            log.info("Event is for incident being resolved, clearing from pager");
            clearIncident(incidentKey);
            return;
        }

        List<Assignee> assignees = payload.getIncident().getAssignments()
                .stream().map(Assignment::getAssignee).collect(Collectors.toList());

        if (isAssigneePagerOwner(assignees) || ! hasPagerOwnerAcknowledged(payload.getIncident().getAcknowledgements())) {
            addIncident(incidentKey);
        }
    }

    private boolean hasPagerOwnerAcknowledged(List<Acknowledgement> acknowledgements) {
        return acknowledgements.stream()
                .anyMatch(acknowledgement ->
                        acknowledgement.getAcknowledger().getId().equals(pagerProperties.getPagerdutyUserid()));
    }

    private void addIncident(String incidentKey) {
        activeIncidentsAssignedToPagerOwner.add(incidentKey);
    }

    private void clearIncident(String incidentKey) {
        if (activeIncidentsAssignedToPagerOwner.contains(incidentKey)) {
            activeIncidentsAssignedToPagerOwner.remove(incidentKey);
        }
    }

    private boolean isAssigneePagerOwner(List<Assignee> assignees) {
        return assignees.stream().anyMatch(assignee -> assignee.getId().equals(pagerProperties.getPagerdutyUserid()));
    }

}
