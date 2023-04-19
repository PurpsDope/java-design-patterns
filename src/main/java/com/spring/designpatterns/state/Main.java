package com.spring.designpatterns.state;

public class Main {

    public static void main(String[] args) {

        MediaPlayer mediaPlayer = new MediaPlayer();

        mediaPlayer.play(); // Output: Started playing... -> Stopped state starts playing.
        mediaPlayer.play(); // Output: [IGNORED] - Already playing! -> Current state was changed to playing, so it ignores the play again command.
        mediaPlayer.stop(); // Output: Stopped playing. -> Playing state stops.
        mediaPlayer.stop(); // Output: [IGNORED] - Already stopped. -> Current state was changed to stopped, so it ignores the stop again command.
    }
}
