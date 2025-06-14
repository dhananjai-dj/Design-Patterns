package com.designPatterns.behavioural.state;

public interface ATMState {
   void display();
   void run();
   void insertCard();
   void provideAccess();
   void makeTransaction();
   void removeCard();
}
