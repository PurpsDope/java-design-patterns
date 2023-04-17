package com.spring.designpatterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeLightingControl {

    private final Logger log = LoggerFactory.getLogger(HomeLightingControl.class);

    public void turnOnLights() {
        log.info("[HomeLightingControl] - Turned lights on!");
    }

    public void turnOffLights() {
        log.info("[HomeLightingControl] - Turned lights off!");
    }

    public void setBrightness(int brightness) {
        log.info("[HomeLightingControl] - Brightness: " + brightness);
    }
}
