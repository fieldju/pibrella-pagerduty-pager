package com.fieldju.pager.model.pagerduty.webhook.v2;

import java.time.OffsetDateTime;
import java.util.List;

public class WebhookPayload {

    private String id;
    private String event;
    private OffsetDateTime createdOn;
    private Incident incident;
    private Webhook webhook;
    private List<LogEntry> logEntries;

    public String getId() {
        return id;
    }

    public WebhookPayload setId(String id) {
        this.id = id;
        return this;
    }

    public String getEvent() {
        return event;
    }

    public WebhookPayload setEvent(String event) {
        this.event = event;
        return this;
    }

    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }

    public WebhookPayload setCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    public Incident getIncident() {
        return incident;
    }

    public WebhookPayload setIncident(Incident incident) {
        this.incident = incident;
        return this;
    }

    public Webhook getWebhook() {
        return webhook;
    }

    public WebhookPayload setWebhook(Webhook webhook) {
        this.webhook = webhook;
        return this;
    }

    public List<LogEntry> getLogEntries() {
        return logEntries;
    }

    public WebhookPayload setLogEntries(List<LogEntry> logEntries) {
        this.logEntries = logEntries;
        return this;
    }
}
