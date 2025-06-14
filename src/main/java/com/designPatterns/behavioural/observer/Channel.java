package com.designPatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Observant {

    private List<Observer> observers = new ArrayList<>();
    private List<String> videos = new ArrayList<>();

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    private void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public List<String> getVideos() {
        return videos;
    }

    public void setVideos(List<String> videos) {
        this.videos = videos;
    }

    public void addVideo(String video) {
        videos.add(video);
        notifyAllObserver();
    }
}
