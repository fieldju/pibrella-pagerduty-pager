package com.fieldju.pager.model.pagerduty.webhook.v2;

public class IncidentUrgencyRule {

    private String type;
    private String urgency;

    public String getType() {
        return type;
    }

    public IncidentUrgencyRule setType(String type) {
        this.type = type;
        return this;
    }

    public String getUrgency() {
        return urgency;
    }

    public IncidentUrgencyRule setUrgency(String urgency) {
        this.urgency = urgency;
        return this;
    }
}
