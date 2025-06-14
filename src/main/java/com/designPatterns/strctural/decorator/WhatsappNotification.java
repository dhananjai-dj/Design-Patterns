package com.designPatterns.strctural.decorator;

public class WhatsappNotification extends Decorator {


    public WhatsappNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void sendNotification(String message) {
        super.sendNotification(message);
        System.out.println("Whatsapp Notification is sent "+message);
    }
}

