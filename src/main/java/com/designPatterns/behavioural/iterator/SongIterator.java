package com.designPatterns.behavioural.iterator;

import java.util.List;

public class SongIterator implements ObjectIterator {
    private final List<Song> songs;
    private       int        position = 0;
    private final int        lastPosition;

    public SongIterator(List<Song> songs) {
        this.songs = songs;
        this.lastPosition = songs.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return position <= lastPosition;
    }

    @Override
    public Song next() {
        Song song = songs.get(position);
        position += 1;
        return song;
    }

}
