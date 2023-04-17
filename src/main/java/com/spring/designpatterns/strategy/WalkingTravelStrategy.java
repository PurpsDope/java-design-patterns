package com.spring.designpatterns.strategy;

public class WalkingTravelStrategy implements TravelStrategy {

    @Override
    public void travel() {
        System.out.println("Travelling on foot..");
    }
}
