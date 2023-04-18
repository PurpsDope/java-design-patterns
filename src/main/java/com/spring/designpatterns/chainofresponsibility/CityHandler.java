package com.spring.designpatterns.chainofresponsibility;

public abstract class CityHandler {

    private CityHandler nextHandler;

    public void setNextHandler(CityHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleCity(City city) {
        if (canHandle(city)) {
            dropCargo(city);
        } else if (nextHandler != null) {
            System.out.println("Transferring to the next city. ");
            nextHandler.handleCity(city);
        }
    }

    protected abstract boolean canHandle(City city);

    protected abstract void dropCargo(City city);
}
