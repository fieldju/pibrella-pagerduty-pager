package com.fieldju.pager.model.pagerduty.webhook;

import java.time.OffsetDateTime;

public class Message {
    private String type;
    private Data data;
    private String id;
    private OffsetDateTime date;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }
}
