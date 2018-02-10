package com.fieldju.pager.model.pagerduty.webhook.v2;

import java.time.OffsetDateTime;

public class Assignment {

    private OffsetDateTime at;
    private Assignee assignee;

    public OffsetDateTime getAt() {
        return at;
    }

    public Assignment setAt(OffsetDateTime at) {
        this.at = at;
        return this;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public Assignment setAssignee(Assignee assignee) {
        this.assignee = assignee;
        return this;
    }
}
