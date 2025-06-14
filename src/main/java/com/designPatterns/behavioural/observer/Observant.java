package com.designPatterns.behavioural.observer;

public interface Observant {
     void subscribe(Observer observer);
     void unsubscribe(Observer observer);
}
