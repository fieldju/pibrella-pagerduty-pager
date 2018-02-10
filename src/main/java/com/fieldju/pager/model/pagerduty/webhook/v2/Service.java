package com.fieldju.pager.model.pagerduty.webhook.v2;

import java.time.OffsetDateTime;
import java.util.List;

public class Service extends PagerDutyObject {

    private String name;
    private String description;
    private Integer autoResolveTimeout;
    private Integer acknowledgementTimeout;
    private OffsetDateTime createdAt;
    private String status;
    private List<Team> teams;
    private IncidentUrgencyRule incidentUrgencyRule;
    private List<Action> scheduledActions;
    private SupportHours supportHours;
    private EscalationPolicy escalationPolicy;
    private List<Addon> addons;
    private Privilege privilege;
    private String alertCreation;
    private List<Integration> integrations;

    public String getName() {
        return name;
    }

    public Service setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Service setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getAutoResolveTimeout() {
        return autoResolveTimeout;
    }

    public Service setAutoResolveTimeout(Integer autoResolveTimeout) {
        this.autoResolveTimeout = autoResolveTimeout;
        return this;
    }

    public Integer getAcknowledgementTimeout() {
        return acknowledgementTimeout;
    }

    public Service setAcknowledgementTimeout(Integer acknowledgementTimeout) {
        this.acknowledgementTimeout = acknowledgementTimeout;
        return this;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public Service setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Service setStatus(String status) {
        this.status = status;
        return this;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public Service setTeams(List<Team> teams) {
        this.teams = teams;
        return this;
    }

    public IncidentUrgencyRule getIncidentUrgencyRule() {
        return incidentUrgencyRule;
    }

    public Service setIncidentUrgencyRule(IncidentUrgencyRule incidentUrgencyRule) {
        this.incidentUrgencyRule = incidentUrgencyRule;
        return this;
    }

    public List<Action> getScheduledActions() {
        return scheduledActions;
    }

    public Service setScheduledActions(List<Action> scheduledActions) {
        this.scheduledActions = scheduledActions;
        return this;
    }

    public SupportHours getSupportHours() {
        return supportHours;
    }

    public Service setSupportHours(SupportHours supportHours) {
        this.supportHours = supportHours;
        return this;
    }

    public EscalationPolicy getEscalationPolicy() {
        return escalationPolicy;
    }

    public Service setEscalationPolicy(EscalationPolicy escalationPolicy) {
        this.escalationPolicy = escalationPolicy;
        return this;
    }

    public List<Addon> getAddons() {
        return addons;
    }

    public Service setAddons(List<Addon> addons) {
        this.addons = addons;
        return this;
    }

    public Privilege getPrivilege() {
        return privilege;
    }

    public Service setPrivilege(Privilege privilege) {
        this.privilege = privilege;
        return this;
    }

    public String getAlertCreation() {
        return alertCreation;
    }

    public Service setAlertCreation(String alertCreation) {
        this.alertCreation = alertCreation;
        return this;
    }

    public List<Integration> getIntegrations() {
        return integrations;
    }

    public Service setIntegrations(List<Integration> integrations) {
        this.integrations = integrations;
        return this;
    }

}
