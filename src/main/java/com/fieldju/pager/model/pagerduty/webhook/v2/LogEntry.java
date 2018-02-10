package com.fieldju.pager.model.pagerduty.webhook.v2;

import java.time.OffsetDateTime;
import java.util.List;

public class LogEntry extends PagerDutyObject {

    private OffsetDateTime createdAt;
    private Channel channel;
    private Agent agent;
    private String note;
    private List<PagerDutyObject> contexts;
    private PagerDutyObject incident;
    private PagerDutyObject service;
    private List<Team> teams;
    private EventDetails eventDetails;

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public LogEntry setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Channel getChannel() {
        return channel;
    }

    public LogEntry setChannel(Channel channel) {
        this.channel = channel;
        return this;
    }

    public Agent getAgent() {
        return agent;
    }

    public LogEntry setAgent(Agent agent) {
        this.agent = agent;
        return this;
    }

    public String getNote() {
        return note;
    }

    public LogEntry setNote(String note) {
        this.note = note;
        return this;
    }

    public List<PagerDutyObject> getContexts() {
        return contexts;
    }

    public LogEntry setContexts(List<PagerDutyObject> contexts) {
        this.contexts = contexts;
        return this;
    }

    public PagerDutyObject getIncident() {
        return incident;
    }

    public LogEntry setIncident(PagerDutyObject incident) {
        this.incident = incident;
        return this;
    }

    public PagerDutyObject getService() {
        return service;
    }

    public LogEntry setService(PagerDutyObject service) {
        this.service = service;
        return this;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public LogEntry setTeams(List<Team> teams) {
        this.teams = teams;
        return this;
    }

    public EventDetails getEventDetails() {
        return eventDetails;
    }

    public LogEntry setEventDetails(EventDetails eventDetails) {
        this.eventDetails = eventDetails;
        return this;
    }
}
