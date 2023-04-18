package com.spring.designpatterns.abstractfactory.car;

public class SubaruCar implements ICar {

    private final String colour;
    private Long price;
    private final CarType carType;

    public SubaruCar(String colour, Long price) {
        this.colour = colour;
        this.price = price;
        this.carType = CarType.GASOLINE;
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
    public CarType getType() {
        return carType;
    }

    @Override
    public String toString() {
        return "SubaruCar{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                ", carType=" + carType +
                '}';
    }
}
