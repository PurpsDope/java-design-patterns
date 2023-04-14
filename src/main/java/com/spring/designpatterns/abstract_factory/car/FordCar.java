package com.spring.designpatterns.abstract_factory;

public class FordCar implements ICar {

    private final String colour;
    private Long price;
    private final Type type;

    public FordCar(String colour, Long price) {
        this.colour = colour;
        this.price = price;
        this.type = Type.HYBRID;
    }

    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public Long getPrice() {
        return price;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "FordCar{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}';
    }


}
