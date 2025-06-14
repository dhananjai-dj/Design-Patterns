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

}
