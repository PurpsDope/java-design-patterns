package com.spring.designpatterns.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {

        final Logger log = LoggerFactory.getLogger(Main.class);

        SmartHome smartHomeAccess = new SmartHome();

        log.info("[MainControl] - Leaving home ->");
        smartHomeAccess.leaveHome();

        log.info("[MainControl] - Returning home <-");
        smartHomeAccess.returnHome();
    }
}
