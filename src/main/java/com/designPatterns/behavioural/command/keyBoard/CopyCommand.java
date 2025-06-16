package com.designPatterns.behavioural.command.keyBoard;

public class CopyCommand implements ControlCommand {
    @Override
    public void execute() {
        System.out.println("Copy command is executed...");
    }
}
