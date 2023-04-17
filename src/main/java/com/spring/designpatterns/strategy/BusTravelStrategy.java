package com.spring.designpatterns.strategy;

public class BusTravelStrategy implements TravelStrategy {

    @Override
    public void travel() {
        System.out.println("Travelling by bus..");
    }
}
