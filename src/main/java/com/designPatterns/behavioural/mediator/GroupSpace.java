package com.designPatterns.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class GroupSpace {
    private final List<Message> messages = new ArrayList<>();
    private final List<Users>   users    = new ArrayList<>();

    public void addMessage(Message message) {
        messages.add(message);
        notifyUsers(message);
    }

    public void addUsers(Users user) {
        users.add(user);
    }

    public void notifyUsers(Message message) {
        for (Users user : users) {
            if (!(message.userId() == user.id)) {
                user.catchMessage(message);
            }
        }
    }

}
