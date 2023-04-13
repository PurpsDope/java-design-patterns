package com.spring.designpatterns.singleton;

public class Coin {

    private static Coin instance;
    private String name;
    private double value;

    private Coin(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public static synchronized Coin getInstance(String name, double value) {
        if (instance == null) {
            instance = new Coin(name, value);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
