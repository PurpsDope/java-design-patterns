package com.spring.designpatterns.chainofresponsibility;

public class AdanaCityHandler extends CityHandler {
    @Override
    protected boolean canHandle(City city) {
        return city == City.ADANA;
    }

    @Override
    protected void dropCargo(City city) {
        if (city == City.ADANA) {
            System.out.println("Dropped cargo in: " + city);
        }
    }
}
