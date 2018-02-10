package com.fieldju.pager.model.pagerduty.webhook.v2;

public class PagerDutyObject {

    private String id;
    private String type;
    private String summary;
    private String self;
    private String htmlUrl;

    public String getId() {
        return id;
    }

    public PagerDutyObject setId(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public PagerDutyObject setType(String type) {
        this.type = type;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public PagerDutyObject setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public String getSelf() {
        return self;
    }

    public PagerDutyObject setSelf(String self) {
        this.self = self;
        return this;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public PagerDutyObject setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }
}
