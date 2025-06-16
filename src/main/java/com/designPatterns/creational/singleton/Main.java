package com.designPatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase1 = DataBase.getInstance();
        dataBase1.getConnection();
        DataBase dataBase2 = DataBase.getInstance();
        dataBase2.getConnection();

        System.out.println("Comparing two separate object with equal symbol" + (dataBase1 == dataBase2));

        Database database = Database.DATABASE;
        database.getConnection();

    }
}
