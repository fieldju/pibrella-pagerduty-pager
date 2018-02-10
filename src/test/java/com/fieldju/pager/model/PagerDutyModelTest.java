package com.fieldju.pager.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fieldju.pager.model.pagerduty.webhook.v2.WebhookPayloadWrapper;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@AutoConfigureJsonTesters
@JsonTest
public class PagerDutyModelTest {

    @Autowired
    ObjectMapper om;

    @Test
    public void test_that_pager_duty_model_deserializes_as_expected() throws IOException {

        String json = IOUtils.toString(this.getClass().getResourceAsStream("/pagerduty-webhook-request-bodies/incident-triggered.json"), "utf-8");

        WebhookPayloadWrapper payload = om.readValue(json,
                WebhookPayloadWrapper.class);

        assertEquals(1, payload.getMessages().size());
    }

}
