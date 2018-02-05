package com.fieldju.pager.controller;

import com.fieldju.pager.model.pagerduty.webhook.Trigger;
import com.fieldju.pager.service.PagerDuty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class PagerWebHook {

    @Autowired
    PagerDuty pagerDuty;

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/pager-duty-hook"
    )
    public void processPagerDutyWebHook(@RequestBody Trigger trigger, HttpServletResponse response) {
        pagerDuty.processTriggerAsync(trigger);
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }

}
