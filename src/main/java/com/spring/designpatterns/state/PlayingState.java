package com.spring.designpatterns.state;

public class PlayingState implements MediaPlayerState {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("[IGNORED] - Already playing!");
    }

    @Override
    public void stop(MediaPlayer player) {
        player.setState(new StoppedState());
        System.out.println("Stopped playing.");
    }
}
