package com.designPatterns.behavioural.iterator;

import java.util.List;

public class PlayList {
    private final List<Song> songs;

    public PlayList(List<Song> songs) {
        this.songs = songs;
    }

    public ObjectIterator iterator() {
        return new SongIterator(songs);
    }


}
