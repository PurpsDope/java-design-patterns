package com.spring.designpatterns.chainofresponsibility;

public class Client {
    public static void main(String[] args) {

        CityHandler istanbulHandler = new IstanbulCityHandler();
        CityHandler ankaraHandler = new AnkaraCityHandler();
        CityHandler izmirHandler = new IzmirCityHandler();
        CityHandler adanaHandler = new AdanaCityHandler();

        istanbulHandler.setNextHandler(ankaraHandler);
        ankaraHandler.setNextHandler(izmirHandler);
        izmirHandler.setNextHandler(adanaHandler);

        Cargo cargo = new Cargo(City.ANKARA);

        istanbulHandler.handleCity(cargo.getDestinationCity());

    }
}
