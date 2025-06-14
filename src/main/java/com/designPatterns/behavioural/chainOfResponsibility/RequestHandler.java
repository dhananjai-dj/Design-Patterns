package com.designPatterns.behavioural.chainOfResponsibility;

public abstract class RequestHandler {
    private RequestHandler requestHandler;

    public RequestHandler next(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
        return requestHandler;
    }

    public void handleRequest(Request request) {
        processRequest(request);
        if (requestHandler != null) {
            requestHandler.handleRequest(request);
        }
    }

    public abstract void processRequest(Request request);
}
