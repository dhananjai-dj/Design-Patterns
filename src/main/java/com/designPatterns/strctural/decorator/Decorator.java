package com.designPatterns.strctural.decorator;

public class Decorator implements Notification {

    protected Notification notification;

    public Decorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void sendNotification(String  msg) {
        notification.sendNotification(msg);
    }
}
