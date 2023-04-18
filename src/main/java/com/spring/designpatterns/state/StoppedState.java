package com.spring.designpatterns.state;

public class StoppedState implements State {

    @Override
    public void play() {
        System.out.println("Playing..");
    }

    @Override
    public void pause() {
        System.out.println("Ignored! Can't pause when stopped..");
    }

    @Override
    public void stop() {
        System.out.println("Ignored! Already stopped..");
    }
}
