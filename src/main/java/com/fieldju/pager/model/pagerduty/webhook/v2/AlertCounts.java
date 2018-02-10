package com.fieldju.pager.model.pagerduty.webhook.v2;

public class AlertCounts {

    private Integer all;
    private Integer triggered;
    private Integer resolved;

    public Integer getAll() {
        return all;
    }

    public AlertCounts setAll(Integer all) {
        this.all = all;
        return this;
    }

    public Integer getTriggered() {
        return triggered;
    }

    public AlertCounts setTriggered(Integer triggered) {
        this.triggered = triggered;
        return this;
    }

    public Integer getResolved() {
        return resolved;
    }

    public AlertCounts setResolved(Integer resolved) {
        this.resolved = resolved;
        return this;
    }
}
