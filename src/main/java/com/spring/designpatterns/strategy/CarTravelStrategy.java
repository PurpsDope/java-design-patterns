package com.spring.designpatterns.strategy;

public class CarTravelStrategy implements TravelStrategy {

    @Override
    public void travel() {
        System.out.println("Travelling by car..");
    }
}
