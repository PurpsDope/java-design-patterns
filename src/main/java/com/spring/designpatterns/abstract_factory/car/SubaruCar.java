package com.spring.designpatterns.abstract_factory.car;

public class MclarenCar implements ICar {

    private final String colour;
    private Long price;
    private final CarType carType;

    public MclarenCar(String colour, Long price) {
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
        return "MclarenCar{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                ", type=" + carType +
                '}';
    }
}
