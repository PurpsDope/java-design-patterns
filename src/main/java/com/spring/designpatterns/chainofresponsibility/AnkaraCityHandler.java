package com.spring.designpatterns.chainofresponsibility;

public class AnkaraCityHandler extends CityHandler {

    @Override
    protected boolean canHandle(City city) {
        return city == City.ANKARA;
    }

    @Override
    protected void dropCargo(City city) {
        if (city == City.ANKARA) {
            System.out.println("Dropped cargo in: " + city);
        }
    }
}
