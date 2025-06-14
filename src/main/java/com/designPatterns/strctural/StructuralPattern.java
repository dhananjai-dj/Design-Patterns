package com.designPatterns.strctural;

import com.designPatterns.strctural.adapter.ExternalApiService;
import com.designPatterns.strctural.bridge.PaymentGateway;
import com.designPatterns.strctural.bridge.PaymentMethod;
import com.designPatterns.strctural.bridge.RazorPay;
import com.designPatterns.strctural.bridge.UPIPayment;
import com.designPatterns.strctural.composite.File;
import com.designPatterns.strctural.composite.Folder;
import com.designPatterns.strctural.decorator.FacebookNotification;
import com.designPatterns.strctural.decorator.Notification;
import com.designPatterns.strctural.decorator.TelegramNotification;
import com.designPatterns.strctural.decorator.WhatsappNotification;
import com.designPatterns.strctural.facade.HomeTheater;
import com.designPatterns.strctural.facade.Projector;
import com.designPatterns.strctural.facade.SoundBar;
import com.designPatterns.strctural.facade.VideoPlayer;
import com.designPatterns.strctural.flyweight.Container;
import com.designPatterns.strctural.flyweight.Order;
import com.designPatterns.strctural.flyweight.Tea;
import com.designPatterns.strctural.flyweight.TeaFactory;
import com.designPatterns.strctural.proxy.ProxyObject;

public class StructuralPattern {
    public static void main(String[] args) throws Exception {
        System.out.println("\nAdapter Pattern");
        ExternalApiService externalApiService = new ExternalApiService();
        System.out.println(externalApiService.adaptAsUser());

        System.out.println("\nProxy Pattern");
        ProxyObject proxyObject = new ProxyObject("Object1");
        proxyObject.display();
        System.out.println("Now check whether proxy object is created");
        proxyObject.display();

        System.out.println("\nDecorator Pattern");
        Notification notifier = new TelegramNotification();
        notifier = new WhatsappNotification(notifier);
        notifier = new FacebookNotification(notifier);
        notifier.sendNotification("Hello World!");

        System.out.println("\nComposite Pattern");
        Folder folder = new Folder("Folder1");
        File file1 = new File("Folder1.txt");
        File file2 = new File("Folder2.txt");
        folder.add(file1);
        folder.add(file2);
        folder.display();

        System.out.println("\nBridge Pattern");
        PaymentGateway razorPay = new RazorPay();
        PaymentMethod paymentMethod = new UPIPayment(razorPay);
        paymentMethod.makePayment();

        System.out.println("\nFacade Pattern\n");
        HomeTheater homeTheater = new HomeTheater(new Projector(), new SoundBar(), new VideoPlayer());
        homeTheater.playMovie();
        System.out.println();
        homeTheater.pauseMovie();
        System.out.println();
        homeTheater.stopMovie();

        System.out.println("\nFlyWeight Pattern");
        TeaFactory teaFactory = new TeaFactory();
        Order order = new Order(teaFactory.makeTea(new Tea("Black Tea")), new Container("PaperCup"));
        order.serve();
    }
}
