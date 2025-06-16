package com.designPatterns.behavioural.command.keyBoard;

public class CutCommand implements ControlCommand {
    @Override
    public void execute() {
        System.out.println("Cut command is executed...");
    }
}
