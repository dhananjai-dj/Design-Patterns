package com.designPatterns.strctural.decorator;

public class TelegramNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("Telegram Notification is sent " + message);
    }
}
