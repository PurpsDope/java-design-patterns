package com.spring.designpatterns.abstractfactory.factory;

import com.spring.designpatterns.abstractfactory.car.FordCar;
import com.spring.designpatterns.abstractfactory.car.ICar;
import com.spring.designpatterns.abstractfactory.plane.FordPlane;
import com.spring.designpatterns.abstractfactory.plane.IPlane;

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
