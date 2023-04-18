package com.spring.designpatterns.abstractfactory.factory;

import com.spring.designpatterns.abstractfactory.car.ICar;
import com.spring.designpatterns.abstractfactory.plane.IPlane;

public interface IAbstractFactory {
    ICar createCar(String color, Long price);
    IPlane createPlane(String color, Long price);
}
