package com.designPatterns.strctural.decorator;

public class FacebookNotification extends Decorator {


    public FacebookNotification(Notification notification) {
        super(notification);
    }


    @Override
    public void sendNotification(String message) {
        super.sendNotification(message);
        System.out.println("Facebook Notification is sent "+message);
    }
}
