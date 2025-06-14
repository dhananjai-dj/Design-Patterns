package com.designPatterns.behavioural.chainOfResponsibility;

public class AuthRequestHandler extends RequestHandler {
    @Override
    public void processRequest(Request request) {
        System.out.println("AuthRequestHandler processRequest  is executed");
    }
}
