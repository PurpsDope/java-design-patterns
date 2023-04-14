package com.spring.designpatterns.abstract_factory.factory;

import com.spring.designpatterns.abstract_factory.car.CarType;
import com.spring.designpatterns.abstract_factory.car.FordCar;
import com.spring.designpatterns.abstract_factory.car.ICar;
import com.spring.designpatterns.abstract_factory.plane.IPlane;
import com.spring.designpatterns.abstract_factory.plane.PlaneType;

public class CarFactory implements IAbstractFactory {

    @Override
    public ICar createCar(String color, Long price, CarType carType) {
        return new FordCar();
    }

    @Override
    public IPlane createPlane(String color, Long price, PlaneType planeType) {
        return null;
    }
}
