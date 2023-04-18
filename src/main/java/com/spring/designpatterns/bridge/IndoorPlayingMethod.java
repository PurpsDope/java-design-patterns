package com.spring.designpatterns.bridge;

public class IndoorPlayingMethod implements PlayingMethod {
    @Override
    public String getMethod() {
        return "Indoor playing method.";
    }

}
