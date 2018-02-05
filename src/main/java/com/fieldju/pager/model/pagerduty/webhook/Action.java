package com.fieldju.pager.model.pagerduty.webhook;

import java.time.OffsetDateTime;

public class Action {
    private String type;
    private OffsetDateTime at;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OffsetDateTime getAt() {
        return at;
    }

    public void setAt(OffsetDateTime at) {
        this.at = at;
    }
}
