package com.spring.designpatterns.state;

public class StoppedState implements MediaPlayerState {
    @Override
    public void play(MediaPlayer player) {
        player.setState(new PlayingState());
        System.out.println("Started playing...");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("[IGNORED] - Already stopped.");
    }
}
