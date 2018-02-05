package com.fieldju.pager.service;

import com.fieldju.pager.model.pagerduty.webhook.Message;
import com.fieldju.pager.model.pagerduty.webhook.Trigger;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class PagerDuty {

    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    public void processTriggerAsync(Trigger trigger) {
        executorService.execute(() -> trigger.getMessages().forEach(this::processMessage));
    }

    private void processMessage(Message message) {

    }
}
