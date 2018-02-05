package com.fieldju.pager.model.pagerduty.webhook;

import java.util.List;

public class Trigger {
    List<Message> messages;

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
