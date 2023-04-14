package com.spring.designpatterns.abstract_factory.plane;

public class SubaruPlane implements IPlane {

    private final String colour;
    private Long price;
    private final PlaneType planeType;

    public SubaruPlane(String colour, Long price) {
        this.colour = colour;
        this.price = price;
        this.planeType = PlaneType.BUSINESS_JET;
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
        return "SubaruPlane{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                ", planeType=" + planeType +
                '}';
    }
}
