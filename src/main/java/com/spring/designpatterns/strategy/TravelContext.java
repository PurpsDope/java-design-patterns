package com.spring.designpatterns.strategy;

public class TravelContext {

    private TravelStrategy travelStrategy;

    public void setTravelContext(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travel() {
        travelStrategy.travel();
    }
}
