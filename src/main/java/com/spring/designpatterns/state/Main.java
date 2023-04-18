package com.spring.designpatterns.state;

public class Main {

    public static void main(String[] args) {

        MediaPlayer mediaPlayer = new MediaPlayer();

        mediaPlayer.play();
        mediaPlayer.pause();
        mediaPlayer.stop();
        mediaPlayer.pause();
        mediaPlayer.play();
    }
}
