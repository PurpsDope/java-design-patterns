package com.spring.designpatterns.adapter;

public class AmericanPlugAdapter {

    private GermanPlug germanPlug;

    public AmericanPlugAdapter(GermanPlug germanPlug) {
        this.germanPlug = germanPlug;
    }

    public void convertPlug() {
        System.out.println("Adapter conversion round -> flat");
        germanPlug.plugRoundPins();
    }
}
