package com.designPatterns.behavioural.iterator;

public class Song {
    private String name;
    public Song(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Playing " + name);
    }
}
