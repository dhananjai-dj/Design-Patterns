package com.designPatterns.behavioural.command.keyBoard;

public class PasteCommand implements ControlCommand {
    @Override
    public void execute() {
        System.out.println("Paste command is executed...");
    }
}
