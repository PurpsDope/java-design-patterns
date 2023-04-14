package com.spring.designpatterns.abstract_factory.factory;

import com.spring.designpatterns.abstract_factory.car.CarType;
import com.spring.designpatterns.abstract_factory.car.ICar;
import com.spring.designpatterns.abstract_factory.plane.IPlane;
import com.spring.designpatterns.abstract_factory.plane.PlaneType;

public interface IAbstractFactory {
    ICar createCar(String color, Long price);
    IPlane createPlane(String color, Long price);
}
