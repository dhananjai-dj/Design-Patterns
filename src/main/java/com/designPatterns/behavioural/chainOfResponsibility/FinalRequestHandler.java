package com.designPatterns.behavioural.chainOfResponsibility;

public class FinalRequestHandler extends RequestHandler {
    @Override
    public void processRequest(Request request) {
        System.out.println("FinalRequestHandler processRequest  is executed");
    }
}
