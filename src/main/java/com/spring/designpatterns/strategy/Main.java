package com.spring.designpatterns.strategy;

public class Main {
    public static void main(String[] args) {

        TravelContext travelContext = new TravelContext();

        travelContext.setTravelContext(new CarTravelStrategy());
        travelContext.travel();

        travelContext.setTravelContext(new BusTravelStrategy());
        travelContext.travel();

        travelContext.setTravelContext(new WalkingTravelStrategy());
        travelContext.travel();
    }
}
