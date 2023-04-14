package com.spring.designpatterns.abstract_factory;


import com.spring.designpatterns.abstract_factory.car.ICar;
import com.spring.designpatterns.abstract_factory.factory.FordFactory;
import com.spring.designpatterns.abstract_factory.factory.IAbstractFactory;
import com.spring.designpatterns.abstract_factory.factory.SubaruFactory;
import com.spring.designpatterns.abstract_factory.plane.IPlane;

public class Main {


    public static void main(String[] args) {

        IAbstractFactory fordFactory = new FordFactory();
        IAbstractFactory subaruFactory = new SubaruFactory();

        ICar fordCar = fordFactory.createCar("red", 3L);
        ICar subaruCar = subaruFactory.createCar("blue", 11L);

        IPlane fordPlane = fordFactory.createPlane("white", 150L);
        IPlane subaruPlane = subaruFactory.createPlane("black", 170L);

        System.out.println(fordCar.toString() + "\n" + "\n" + subaruCar.toString() + "\n" + "\n" + fordPlane.toString() + "\n" + "\n" + subaruPlane.toString());

    }
}
