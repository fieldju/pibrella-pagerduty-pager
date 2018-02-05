package com.fieldju.pager.model.pagerduty.webhook;

import java.time.OffsetDateTime;

public class Assignee {
    private OffsetDateTime at;
    private User object;

    public OffsetDateTime getAt() {
        return at;
    }

    public void setAt(OffsetDateTime at) {
        this.at = at;
    }

    public User getObject() {
        return object;
    }

    public void setObject(User object) {
        this.object = object;
    }
}
