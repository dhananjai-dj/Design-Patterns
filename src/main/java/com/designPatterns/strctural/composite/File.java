package com.designPatterns.strctural.composite;

public class File implements FileSystem {
    private final String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("File name is " + fileName);
    }
}
