package com.fieldju.pager.model.pagerduty.webhook.v2;

import java.util.Arrays;

public enum Event {

    INCIDENT_TRIGGER("incident.trigger", "Sent when an incident is newly created/triggered."),
    INCIDENT_ACKNOWLEDGE("incident.acknowledge", "Sent when an incident is acknowledged by a user."),
    INCIDENT_UNACKNOWLEDGE("incident.unacknowledge", "Sent when an incident is unacknowledged due to its acknowledgement timing out."),
    INCIDENT_RESOLVE("incident.resolve", "Sent when an incident has been resolved."),
    INCIDENT_ASSIGN("incident.assign", "Sent when an incident has been assigned to another user. Often occurs in concert with an acknowledge."),
    INCIDENT_ESCALATE("incident.escalate", "Sent when an incident has been escalated to another user in the same escalation chain."),
    INCIDENT_DELEGATE("incident.delegate", "Sent when an incident has been reassigned to another escalation policy."),
    INCIDENT_ANNOTATE("incident.annotate", "Sent when a note is created on an incident.");

    private final String name;
    private final String description;

    Event(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static Event fromName(String name) {
        return Arrays.stream(Event.values())
                .filter(webhookType -> webhookType.name.equals(name))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Failed to get Webhook type from name: " + name));
    }
}
