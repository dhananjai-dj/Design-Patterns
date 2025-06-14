package com.designPatterns.behavioural.mediator;

public class Users {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    public Users(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void catchMessage(Message message) {
        System.out.println("Message received for user " + id + "and the message is" + message);
    }
}
