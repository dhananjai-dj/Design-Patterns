package com.designPatterns.behavioural.command;

public class CutCommand implements ControlCommand {
    @Override
    public void execute() {
        System.out.println("Cut command is executed...");
    }
}
