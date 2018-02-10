package com.fieldju.pager.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("pager")
public class PagerProperties {

    private String pagerdutyUserid;

    public String getPagerdutyUserid() {
        return pagerdutyUserid;
    }

    public PagerProperties setPagerdutyUserid(String pagerdutyUserid) {
        this.pagerdutyUserid = pagerdutyUserid;
        return this;
    }
}
