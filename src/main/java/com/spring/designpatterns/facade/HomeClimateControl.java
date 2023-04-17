package com.spring.designpatterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeClimateControl {

    private final Logger log = LoggerFactory.getLogger(HomeClimateControl.class);

    public void adjustTemperature(int temperature) {
        log.info("[HomeClimateControl] - Temperature set: " + temperature);
    }

    public void setFanSpeed(int speed) {
        log.info("[HomeClimateControl] - Fan speed set: " + speed);
    }

    public void setMode(String mode) {
        log.info("[HomeClimateControl] - Climate mode: " + mode);
    }
}
