package com.spring.designpatterns.chainofresponsibility;

public class Cargo {

    private City destinationCity;

    public Cargo(City destinationCity) {
        this.destinationCity = destinationCity;
    }

    public City getDestinationCity() {
        return destinationCity;
    }
}
