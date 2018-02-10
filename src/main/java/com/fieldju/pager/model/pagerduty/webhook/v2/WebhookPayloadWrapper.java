package com.fieldju.pager.model.pagerduty.webhook.v2;

import java.util.List;

public class WebhookPayloadWrapper {

    List<WebhookPayload> messages;

    public List<WebhookPayload> getMessages() {
        return messages;
    }

    public WebhookPayloadWrapper setMessages(List<WebhookPayload> messages) {
        this.messages = messages;
        return this;
    }
}
