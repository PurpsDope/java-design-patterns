package com.spring.designpatterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeSecurityControl {

    private final Logger log = LoggerFactory.getLogger(HomeSecurityControl.class);

    public void lockDoors() {
        log.info("[HomeSecurityControl] - Locked doors!");
    }

    public void unlockDoors() {
        log.info("[HomeSecurityControl] - Unlocked doors!");
    }

    public void setSecurityMode(String securityMode) {
        log.info("[HomeSecurityControl] - Security mode set to: " + securityMode);
    }

}
