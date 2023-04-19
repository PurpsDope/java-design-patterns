package com.spring.designpatterns.state;

public class MediaPlayer {

    private MediaPlayerState state;

    public MediaPlayer() {
        state = new StoppedState();
    }

    public void setState(MediaPlayerState state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void stop() {
        state.stop(this);
    }

}
