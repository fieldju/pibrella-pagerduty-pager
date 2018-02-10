package com.fieldju.pager.model.pagerduty.webhook.v2;

import java.time.OffsetDateTime;

public class Acknowledgement {

    private OffsetDateTime at;
    private Acknowledger acknowledger;

    public OffsetDateTime getAt() {
        return at;
    }

    public Acknowledgement setAt(OffsetDateTime at) {
        this.at = at;
        return this;
    }

    public Acknowledger getAcknowledger() {
        return acknowledger;
    }

    public Acknowledgement setAcknowledger(Acknowledger acknowledger) {
        this.acknowledger = acknowledger;
        return this;
    }

}
