package com.fieldju.pager.controller;

import com.fieldju.pager.model.pagerduty.webhook.Trigger;
import com.fieldju.pager.service.PagerDuty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class PagerWebHook {

    private final PagerDuty pagerDuty;

    @Autowired
    public PagerWebHook(PagerDuty pagerDuty) {
        this.pagerDuty = pagerDuty;
    }

    @PostMapping("/pagerduty-hook" )
    public void processPagerDutyWebHook(@RequestBody Trigger trigger, HttpServletResponse response) {
        pagerDuty.processTriggerAsync(trigger);
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }

}
