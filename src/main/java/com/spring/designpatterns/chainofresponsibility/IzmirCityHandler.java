package com.spring.designpatterns.chainofresponsibility;

public class IzmirCityHandler extends CityHandler {
    @Override
    protected boolean canHandle(City city) {
        return city == City.IZMIR;
    }

    @Override
    protected void dropCargo(City city) {
        if (city == City.IZMIR) {
            System.out.println("Dropped cargo in: " + city);
        }
    }
}
