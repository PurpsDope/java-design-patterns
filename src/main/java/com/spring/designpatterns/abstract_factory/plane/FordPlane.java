package com.spring.designpatterns.abstract_factory.plane;


public class FighterPlane implements IPlane {

    private final String colour;
    private Long price;
    private final PlaneType planeType;

    public FighterPlane(String colour, Long price) {
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

}
