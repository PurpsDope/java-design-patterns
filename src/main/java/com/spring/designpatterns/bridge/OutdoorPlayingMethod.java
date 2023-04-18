package com.spring.designpatterns.bridge;

public class OutdoorPlayingMethod implements PlayingMethod {
    @Override
    public String getMethod() {
        return "Outdoor playing method.";
    }
}
