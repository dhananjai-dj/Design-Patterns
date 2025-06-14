package com.designPatterns.behavioural.chainOfResponsibility;

public class ChainFilter {
    private final RequestHandler logRequestHandler;
    private final RequestHandler requestHandler;
    private final RequestHandler finalRequestHandler;

    public ChainFilter(RequestHandler logRequestHandler, RequestHandler requestHandler, RequestHandler finalRequestHandler) {
        this.logRequestHandler = logRequestHandler;
        this.requestHandler = requestHandler;
        this.finalRequestHandler = finalRequestHandler;

        logRequestHandler.next(requestHandler).next(finalRequestHandler);
    }

    public void execute(Request request) {
        logRequestHandler.handleRequest(request);
    }
}
