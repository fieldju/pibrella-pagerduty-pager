package com.fieldju.pager.controller;

import com.fieldju.pager.model.pagerduty.webhook.v2.WebhookPayloadWrapper;
import com.fieldju.pager.service.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class PagerWebhook {

    private final Pager pagerDuty;

    @Autowired
    public PagerWebhook(Pager pagerDuty) {
        this.pagerDuty = pagerDuty;
    }

    @PostMapping("/pagerduty-hook" )
    public void processPagerDutyWebhook(@RequestBody WebhookPayloadWrapper webhookPayloadWrapper, HttpServletResponse response) {
        pagerDuty.processTriggerAsync(webhookPayloadWrapper);
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }

}
