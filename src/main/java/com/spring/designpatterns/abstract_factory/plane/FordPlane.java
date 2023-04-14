package com.spring.designpatterns.abstract_factory.plane;


public class FordPlane implements IPlane {

    private final String colour;
    private Long price;
    private final PlaneType planeType;

    public FordPlane(String colour, Long price) {
        this.colour = colour;
        this.price = price;
        this.planeType = PlaneType.FIGHTER_AIRCRAFT;
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
    public PlaneType getType() {
        return planeType;
    }

    @Override
    public String toString() {
        return "FordPlane{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                ", planeType=" + planeType +
                '}';
    }
}
