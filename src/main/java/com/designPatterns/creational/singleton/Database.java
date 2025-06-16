package com.designPatterns.creational.singleton;

public enum Database {
    DATABASE;

    private void createConnection() {
        System.out.println("Creating connection to database...");
    };

    public void getConnection(){
        System.out.println("Getting connection to database...");
        createConnection();
    }
}
