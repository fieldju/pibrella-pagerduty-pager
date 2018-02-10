package com.fieldju.pager.model.pagerduty.webhook.v2;

import java.time.OffsetDateTime;

public class Action {

    private String type;
    private OffsetDateTime at;

    public String getType() {
        return type;
    }

    public Action setType(String type) {
        this.type = type;
        return this;
    }

    public OffsetDateTime getAt() {
        return at;
    }

    public Action setAt(OffsetDateTime at) {
        this.at = at;
        return this;
    }
}
