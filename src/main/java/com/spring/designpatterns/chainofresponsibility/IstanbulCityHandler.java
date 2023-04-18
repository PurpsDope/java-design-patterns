package com.spring.designpatterns.chainofresponsibility;

public class IstanbulCityHandler extends CityHandler {

    @Override
    protected boolean canHandle(City city) {
        return city == City.ISTANBUL;
    }

    @Override
    protected void dropCargo(City city) {
        if (city == City.ISTANBUL) {
            System.out.println("Dropped cargo in: " + city);
        }
    }
}
