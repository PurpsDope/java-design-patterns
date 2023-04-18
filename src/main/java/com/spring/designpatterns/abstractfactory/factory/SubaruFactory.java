package com.spring.designpatterns.abstractfactory.factory;

import com.spring.designpatterns.abstractfactory.car.ICar;
import com.spring.designpatterns.abstractfactory.car.SubaruCar;
import com.spring.designpatterns.abstractfactory.plane.IPlane;

import com.spring.designpatterns.abstractfactory.plane.SubaruPlane;

public class SubaruFactory implements IAbstractFactory {

    @Override
    public ICar createCar(String color, Long price) {
        return new SubaruCar(color, price);
    }

    @Override
    public IPlane createPlane(String color, Long price) {
        return new SubaruPlane(color, price);
    }
}
