package com.fieldju.pager.model.pagerduty.webhook;

import java.time.OffsetDateTime;
import java.util.List;

public class Incident {
    private String id;
    private Integer IncidentNumber;
    private OffsetDateTime createdOn;
    private String status;
    private List<Action> pendingActions;
    private String htmlUrl;
    private String incidentKey;
    private Service service;
    private EscalationPolicy escalationPolicy;
    private User assignedToUser;
    private SummeryData triggerSummeryData;
    private String triggerDetailsHtmlUrl;
    private String triggerType;
    private OffsetDateTime lastStatusChange;
    private User lastStatusChangedBy;
    private Integer numberOfEscalations;
    private String integrationName;
    private Assignee assignedTo;
    private String urgency;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIncidentNumber() {
        return IncidentNumber;
    }

    public void setIncidentNumber(Integer incidentNumber) {
        IncidentNumber = incidentNumber;
    }

    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Action> getPendingActions() {
        return pendingActions;
    }

    public void setPendingActions(List<Action> pendingActions) {
        this.pendingActions = pendingActions;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getIncidentKey() {
        return incidentKey;
    }

    public void setIncidentKey(String incidentKey) {
        this.incidentKey = incidentKey;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public EscalationPolicy getEscalationPolicy() {
        return escalationPolicy;
    }

    public void setEscalationPolicy(EscalationPolicy escalationPolicy) {
        this.escalationPolicy = escalationPolicy;
    }

    public User getAssignedToUser() {
        return assignedToUser;
    }

    public void setAssignedToUser(User assignedToUser) {
        this.assignedToUser = assignedToUser;
    }

    public SummeryData getTriggerSummeryData() {
        return triggerSummeryData;
    }

    public void setTriggerSummeryData(SummeryData triggerSummeryData) {
        this.triggerSummeryData = triggerSummeryData;
    }

    public String getTriggerDetailsHtmlUrl() {
        return triggerDetailsHtmlUrl;
    }

    public void setTriggerDetailsHtmlUrl(String triggerDetailsHtmlUrl) {
        this.triggerDetailsHtmlUrl = triggerDetailsHtmlUrl;
    }

    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public OffsetDateTime getLastStatusChange() {
        return lastStatusChange;
    }

    public void setLastStatusChange(OffsetDateTime lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
    }

    public User getLastStatusChangedBy() {
        return lastStatusChangedBy;
    }

    public void setLastStatusChangedBy(User lastStatusChangedBy) {
        this.lastStatusChangedBy = lastStatusChangedBy;
    }

    public Integer getNumberOfEscalations() {
        return numberOfEscalations;
    }

    public void setNumberOfEscalations(Integer numberOfEscalations) {
        this.numberOfEscalations = numberOfEscalations;
    }

    public String getIntegrationName() {
        return integrationName;
    }

    public void setIntegrationName(String integrationName) {
        this.integrationName = integrationName;
    }

    public Assignee getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Assignee assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }
}
