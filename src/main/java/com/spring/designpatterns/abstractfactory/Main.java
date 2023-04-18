package com.spring.designpatterns.abstractfactory;


import com.spring.designpatterns.abstractfactory.car.ICar;
import com.spring.designpatterns.abstractfactory.factory.FordFactory;
import com.spring.designpatterns.abstractfactory.factory.IAbstractFactory;
import com.spring.designpatterns.abstractfactory.factory.SubaruFactory;
import com.spring.designpatterns.abstractfactory.plane.IPlane;

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
