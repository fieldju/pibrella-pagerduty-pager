package com.fieldju.pager.service;

import com.pi4j.component.button.ButtonEvent;
import com.pi4j.component.button.ButtonPressedListener;
import com.pi4j.component.buzzer.Buzzer;
import com.pi4j.device.pibrella.Pibrella;
import com.pi4j.device.pibrella.PibrellaLed;
import com.pi4j.device.pibrella.PibrellaOutput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ButtonListener {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private final Pibrella pibrella;

    @Autowired
    public ButtonListener(Pibrella pibrella) {

        this.pibrella = pibrella;
        pibrella.button().addListener(new Listener());
    }

    class Listener implements ButtonPressedListener {

        boolean toggle;

        @Override
        public void onButtonPressed(ButtonEvent event) {
            toggle = !toggle;
            if (toggle) {
                pibrella.getLed(PibrellaLed.YELLOW).on();
                pibrella.getOutputPin(PibrellaOutput.H).toggle();
            } else {
                pibrella.getLed(PibrellaLed.YELLOW).off();
                pibrella.getOutputPin(PibrellaOutput.H).toggle();
            }
        }
    }
}
