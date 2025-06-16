package com.designPatterns.creational.singleton;

public class DataBase {

    private DataBase() {
    }

    private static DataBase dataBaseObject;

    public /*synchronized*/ static DataBase getInstance() {

        if (dataBaseObject == null) {
            synchronized (DataBase.class) {
                dataBaseObject = new DataBase();
            }
        }
        return dataBaseObject;

    }

    private void createConnection() {
        System.out.println("Creating connection to database...");
    };

    public void getConnection(){
        System.out.println("Getting connection to database...");
        createConnection();
    }

}
