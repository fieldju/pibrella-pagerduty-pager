package com.fieldju.pager.configuration;

import com.pi4j.device.pibrella.Pibrella;
import com.pi4j.device.pibrella.impl.PibrellaDevice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalConfiguration {

    @Bean
    public Pibrella pibrella() {
        return new PibrellaDevice();
    }

}
