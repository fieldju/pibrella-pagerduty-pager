package com.fieldju.pager.model.pagerduty.webhook.v2;

public class Webhook {

    private String endpointUrl;
    private String name;
    private String description;
    private WebhookObject webhookObject;

    public String getEndpointUrl() {
        return endpointUrl;
    }

    public Webhook setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
        return this;
    }

    public String getName() {
        return name;
    }

    public Webhook setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Webhook setDescription(String description) {
        this.description = description;
        return this;
    }

    public WebhookObject getWebhookObject() {
        return webhookObject;
    }

    public Webhook setWebhookObject(WebhookObject webhookObject) {
        this.webhookObject = webhookObject;
        return this;
    }
}
