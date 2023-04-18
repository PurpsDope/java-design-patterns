package com.spring.designpatterns.state;

public class PlayingState implements State {


    @Override
    public void play() {
        System.out.println("Ignored! Already playing..");
    }

    @Override
    public void pause() {
        System.out.println("Pausing..");
    }

    @Override
    public void stop() {
        System.out.println("Stopped..");
    }
}
