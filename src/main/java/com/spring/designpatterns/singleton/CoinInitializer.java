package com.spring.designpatterns.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Info {

    private static final Logger log = LoggerFactory.getLogger(Info.class);

    static Coin coin = Coin.getInstance("United States Dollar", 18.91);

    public void convertCoinToEuro() {
        coin.setName("EUR");
        coin.setValue(21.00);
        log.info("Coin updated: {}", coin);
    }

    public void convertCoinToTL() {
        coin.setName("TL");
        coin.setValue(1.00);
        log.info("Coin updated: {}", coin);
    }

    public static void main(String[] args) {
        Info coinInfo = new Info();
        log.info("First Initialized Dollar Coin: {}, {}", coin.getName(), coin.getValue());
        coinInfo.convertCoinToEuro();
        log.info("Euro Coin: {}, {}", coin.getName(), coin.getValue());
        coinInfo.convertCoinToTL();
        log.info("TL Coin: {}, {}", coin.getName(), coin.getValue());
    }
}
