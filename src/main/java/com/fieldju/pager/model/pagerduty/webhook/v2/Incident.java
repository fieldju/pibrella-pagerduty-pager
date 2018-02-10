package com.fieldju.pager.model.pagerduty.webhook.v2;

import java.time.OffsetDateTime;
import java.util.List;

public class Incident {

    private String id;
    private Integer incidentNumber;
    private String title;
    private String Description;
    private OffsetDateTime createdAt;
    private String status;
    private String incidentKey;
    private String htmlUrl;
    private List<Action> pendingActions;
    private Service service;
    private List<Assignment> assignments;
    private List<Acknowledgement> acknowledgements;
    private OffsetDateTime lastStatusChangeAt;
    private PagerDutyObject lastStatusChangeby;
    private PagerDutyObject firstTriggerLogEntry;
    private PagerDutyObject escalationPolicy;
    private List<Team> teams;
    private PagerDutyObject priority;
    private String urgency;
    private String resolveReason;
    private AlertCounts alertCounts;

    public String getId() {
        return id;
    }

    public Incident setId(String id) {
        this.id = id;
        return this;
    }

    public Integer getIncidentNumber() {
        return incidentNumber;
    }

    public Incident setIncidentNumber(Integer incidentNumber) {
        this.incidentNumber = incidentNumber;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Incident setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return Description;
    }

    public Incident setDescription(String description) {
        Description = description;
        return this;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public Incident setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Incident setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getIncidentKey() {
        return incidentKey;
    }

    public Incident setIncidentKey(String incidentKey) {
        this.incidentKey = incidentKey;
        return this;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public Incident setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    public List<Action> getPendingActions() {
        return pendingActions;
    }

    public Incident setPendingActions(List<Action> pendingActions) {
        this.pendingActions = pendingActions;
        return this;
    }

    public Service getService() {
        return service;
    }

    public Incident setService(Service service) {
        this.service = service;
        return this;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public Incident setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
        return this;
    }

    public List<Acknowledgement> getAcknowledgements() {
        return acknowledgements;
    }

    public Incident setAcknowledgements(List<Acknowledgement> acknowledgements) {
        this.acknowledgements = acknowledgements;
        return this;
    }

    public OffsetDateTime getLastStatusChangeAt() {
        return lastStatusChangeAt;
    }

    public Incident setLastStatusChangeAt(OffsetDateTime lastStatusChangeAt) {
        this.lastStatusChangeAt = lastStatusChangeAt;
        return this;
    }

    public PagerDutyObject getLastStatusChangeby() {
        return lastStatusChangeby;
    }

    public Incident setLastStatusChangeby(PagerDutyObject lastStatusChangeby) {
        this.lastStatusChangeby = lastStatusChangeby;
        return this;
    }

    public PagerDutyObject getFirstTriggerLogEntry() {
        return firstTriggerLogEntry;
    }

    public Incident setFirstTriggerLogEntry(PagerDutyObject firstTriggerLogEntry) {
        this.firstTriggerLogEntry = firstTriggerLogEntry;
        return this;
    }

    public PagerDutyObject getEscalationPolicy() {
        return escalationPolicy;
    }

    public Incident setEscalationPolicy(PagerDutyObject escalationPolicy) {
        this.escalationPolicy = escalationPolicy;
        return this;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public Incident setTeams(List<Team> teams) {
        this.teams = teams;
        return this;
    }

    public PagerDutyObject getPriority() {
        return priority;
    }

    public Incident setPriority(PagerDutyObject priority) {
        this.priority = priority;
        return this;
    }

    public String getUrgency() {
        return urgency;
    }

    public Incident setUrgency(String urgency) {
        this.urgency = urgency;
        return this;
    }

    public String getResolveReason() {
        return resolveReason;
    }

    public Incident setResolveReason(String resolveReason) {
        this.resolveReason = resolveReason;
        return this;
    }

    public AlertCounts getAlertCounts() {
        return alertCounts;
    }

    public Incident setAlertCounts(AlertCounts alertCounts) {
        this.alertCounts = alertCounts;
        return this;
    }
}
