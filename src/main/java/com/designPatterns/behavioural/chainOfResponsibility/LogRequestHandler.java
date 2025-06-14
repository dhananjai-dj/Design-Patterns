package com.designPatterns.behavioural.chainOfResponsibility;

public class LogRequestHandler extends RequestHandler {
    @Override
    public void processRequest(Request request) {
        System.out.println("LogRequestHandler processRequest  is executed");
    }
}
