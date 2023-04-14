package com.spring.designpatterns.abstract_factory.factory;

import com.spring.designpatterns.abstract_factory.car.FordCar;
import com.spring.designpatterns.abstract_factory.car.ICar;
import com.spring.designpatterns.abstract_factory.plane.FordPlane;
import com.spring.designpatterns.abstract_factory.plane.IPlane;

public class FordFactory implements IAbstractFactory {

    @Override
    public ICar createCar(String color, Long price) {
        return new FordCar(color, price);
    }

    @Override
    public IPlane createPlane(String color, Long price) {
        return new FordPlane(color, price);
    }
}
