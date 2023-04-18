package com.spring.designpatterns.state;

public class PausedState implements State {
    @Override
    public void play() {
        System.out.println("Resuming..");
    }

    @Override
    public void pause() {
        System.out.println("Ignored! Already paused..");
    }

    @Override
    public void stop() {
        System.out.println("Stopped..");
    }
}
