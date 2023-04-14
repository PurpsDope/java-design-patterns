package com.spring.designpatterns.abstract_factory.factory;

import com.spring.designpatterns.abstract_factory.car.ICar;
import com.spring.designpatterns.abstract_factory.car.SubaruCar;
import com.spring.designpatterns.abstract_factory.plane.IPlane;

import com.spring.designpatterns.abstract_factory.plane.SubaruPlane;

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
