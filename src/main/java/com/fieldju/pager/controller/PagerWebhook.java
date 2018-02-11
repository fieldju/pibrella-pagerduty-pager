package com.fieldju.pager.controller;

import com.fieldju.pager.model.pagerduty.webhook.v2.WebhookPayloadWrapper;
import com.fieldju.pager.service.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class PagerWebhook {

    private final Pager pager;

    @Autowired
    public PagerWebhook(Pager pager) {
        this.pager = pager;
    }

    @PostMapping("/pagerduty-hook" )
    public void processPagerDutyWebhook(@RequestBody WebhookPayloadWrapper webhookPayloadWrapper, HttpServletResponse response) {
        pager.processTriggerAsync(webhookPayloadWrapper);
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }

}
