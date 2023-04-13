package com.spring.designpatterns.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoinInitializer {

    private static final Logger log = LoggerFactory.getLogger(CoinInitializer.class);

    static Coin coin = Coin.getInstance("United States Dollar", 18.91);

    public void convertCoinToEuro() {
        coin.setName("EUR");
        coin.setValue(21.00);
        log.info("Coin updated: {}", coin.getName());
    }

    public void convertCoinToTL() {
        coin.setName("TL");
        coin.setValue(1.00);
        log.info("Coin updated: {}", coin.getName());
    }

    public static void main(String[] args) {
        CoinInitializer coinInitializer = new CoinInitializer();
        log.info("First Initialized Coin: {}, {}", coin.getName(), coin.getValue());
        coinInitializer.convertCoinToEuro();
        log.info("Coin: {}, {}", coin.getName(), coin.getValue());
        coinInitializer.convertCoinToTL();
        log.info("Coin: {}, {}", coin.getName(), coin.getValue());
    }
}
