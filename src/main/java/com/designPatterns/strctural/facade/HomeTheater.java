package com.designPatterns.strctural.facade;

public class HomeTheater {
    Projector   projector;
    SoundBar    soundBar;
    VideoPlayer videoPlayer;

    public HomeTheater(Projector projector, SoundBar soundBar, VideoPlayer videoPlayer) {
        this.projector = projector;
        this.soundBar = soundBar;
        this.videoPlayer = videoPlayer;
    }

    public void playMovie() {
        System.out.println("Playing Movie");
        projector.turnOn();
        soundBar.turnOn();
        soundBar.increaseVolume();
        videoPlayer.play();
    }

    public void pauseMovie() {
        System.out.println("Pausing Movie");
        videoPlayer.pause();
    }

    public void stopMovie() {
        System.out.println("Stopping Movie");
        videoPlayer.stop();
        soundBar.turnOff();
        projector.turnOff();
    }
}
