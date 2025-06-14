package com.designPatterns.creational;

import com.designPatterns.creational.abstractFactroy.Car;
import com.designPatterns.creational.prototype.Invoice;
import com.designPatterns.creational.prototype.Plan;
import com.designPatterns.creational.prototype.User;
import com.designPatterns.creational.abstractFactroy.TeslaFactory;
import com.designPatterns.creational.abstractFactroy.VehicleFactory;
import com.designPatterns.creational.builder.HPMotherBoard;
import com.designPatterns.creational.builder.MotherBoard;
import com.designPatterns.creational.builder.MotherBoardBuilder;
import com.designPatterns.creational.factory.BMWCar;
import com.designPatterns.creational.factory.TeslaCar;
import com.designPatterns.creational.singleton.DataBase;

public class CreationalPatterns {
    public static void main(String[] args) {
        System.out.println("Singleton Design Pattern");
        DataBase obj1 = DataBase.getInstance();
        DataBase obj2 = DataBase.getInstance();
        System.out.println(obj1 == obj2);

        System.out.println("\nBuilder Design Pattern");
        MotherBoardBuilder motherBoardBuilder = new HPMotherBoard();
        MotherBoard motherBoard = motherBoardBuilder.addRAM(16).addHDD(100).addProcessor("Intel i5").addGraphicsCard("NVIDIA RTX 3090")
                .addWiFiModule(true).addUSBPorts(2).addCoolingSystem("Air-co").build();
        System.out.println(motherBoard.toString());

        System.out.println("\nPrototype Design Pattern");
        User user = new User();
        user.setName("John");
        user.setEmail("john@gmail.com");
        user.setUsage(10);
        Plan plan = new Plan();
        plan.setName("Plan1");
        plan.setDescription("MonthlyPlan");
        plan.setPrice(100);
        Invoice januaryInvoice = new Invoice(user, plan);
        Invoice FebruaryInvoice = (Invoice) januaryInvoice.clone();
        System.out.println(januaryInvoice);
        System.out.println(FebruaryInvoice);

        System.out.println("\nFactory Design Pattern");
        com.designPatterns.creational.factory.Car car1 = new BMWCar("320i", "White", 2019, 100000.0, "2.0");
        com.designPatterns.creational.factory.Car car2 = new TeslaCar("Model S", "Red", 2020, 150000.0, "3.0");
        // car1.assemble();
        car1.deliver();
        car2.assemble();
        car2.deliver();

        System.out.println("\nAbstract Factory Design Pattern");
        VehicleFactory teslaFactory = new TeslaFactory();
        Car teslaCar = teslaFactory.createCar();
        teslaCar.assemble();
    }
}
