package com.designPatterns.strctural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {
    private final String     folderName;
    private final List<File> files = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void add(File file) {
        files.add(file);
    }

    public void remove(File file) {
        files.remove(file);
    }

    @Override
    public void display() {
        System.out.println("Folder name is " + folderName);
        for (File file : files) {
            file.display();
        }
    }
}
