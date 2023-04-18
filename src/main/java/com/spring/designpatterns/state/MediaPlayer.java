package com.spring.designpatterns.state;

public class MediaPlayer {

    private State state;

    public MediaPlayer() {
        state = new StoppedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        state.play();
        setState(new PlayingState());
    }

    public void pause() {
        state.pause();
        setState(new PausedState());
    }

    public void stop() {
        state.stop();
        setState(new StoppedState());
    }
}
