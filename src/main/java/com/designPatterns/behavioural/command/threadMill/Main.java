package com.designPatterns.behavioural.command.threadMill;

public class Main {
    public static void main(String[] args) {
        ThreadMillCommandResolver commandResolver = new ThreadMillCommandResolver();
        ThreadMillSetting threadMillSetting = new ThreadMillSetting();
        commandResolver.executeCommand("increaseSpeed", threadMillSetting);
        commandResolver.executeCommand("decreaseSpeed", threadMillSetting);
        commandResolver.executeCommand("reset", threadMillSetting);
    }
}
