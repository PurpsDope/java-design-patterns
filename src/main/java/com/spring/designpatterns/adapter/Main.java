package com.spring.designpatterns.adapter;

public class Main {

    public static void main(String[] args) {

        GermanPlug germanPlug = new GermanPlug();
        AmericanPlugAdapter adapter = new AmericanPlugAdapter(germanPlug);
        AmericanOutlet americanOutlet = new AmericanOutlet();

        adapter.convertPlug();
        americanOutlet.plugFlatPins();

    }
}
