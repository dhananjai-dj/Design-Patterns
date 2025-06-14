package com.designPatterns.behavioural;

import com.designPatterns.behavioural.iterator.ObjectIterator;
import com.designPatterns.behavioural.iterator.PlayList;
import com.designPatterns.behavioural.iterator.Song;
import com.designPatterns.behavioural.visitor.Book;
import com.designPatterns.behavioural.visitor.ItemVisitor;
import com.designPatterns.behavioural.visitor.Pen;
import com.designPatterns.behavioural.visitor.TaxCalculator;
import com.designPatterns.behavioural.chainOfResponsibility.*;
import com.designPatterns.behavioural.command.ControlCommand;
import com.designPatterns.behavioural.command.ControlCommandResolver;
import com.designPatterns.behavioural.command.ControlKey;
import com.designPatterns.behavioural.mediator.GroupSpace;
import com.designPatterns.behavioural.mediator.Message;
import com.designPatterns.behavioural.mediator.Users;
import com.designPatterns.behavioural.memento.TransactionProcess;
import com.designPatterns.behavioural.memento.TransactionState;
import com.designPatterns.behavioural.observer.Channel;
import com.designPatterns.behavioural.observer.Person;
import com.designPatterns.behavioural.state.ATM;
import com.designPatterns.behavioural.strategy.CardTransaction;
import com.designPatterns.behavioural.strategy.PaymentService;
import com.designPatterns.behavioural.template.AmazonPay;
import com.designPatterns.behavioural.template.GPay;
import com.designPatterns.behavioural.template.UPI;

import java.util.Arrays;
import java.util.List;

public class BehaviouralPattern {

    public static void main(String[] args) {

        //Template Pattern
        UPI gPay = new GPay("dhananjai8084@okhdfc.com");
        UPI amazonPay = new AmazonPay("dhananjai8084@okhdfc.com");
        if (gPay.makeTransaction()) {
            System.out.println("UPI Transaction Successfully done by GPay");
        } else if (amazonPay.makeTransaction()) {
            System.out.println("UPI Transaction Successfully done by AmazonPay");
        }

        //Strategy Pattern
        PaymentService paymentService = new PaymentService(new CardTransaction());
        paymentService.makeTransaction();

        //Command Pattern
        ControlCommandResolver commandResolver = new ControlCommandResolver();
        ControlCommand command = commandResolver.resolve(new ControlKey("ctrl", "p"));
        command.execute();

        //State Pattern
        System.out.println("\nSTATE PATTERN");
        ATM atm = new ATM();
        atm.display();
        atm.run();
        atm.insertCard();
        atm.display();
        atm.run();
        atm.provideAccess();
        atm.display();
        atm.run();
        atm.makeTransaction();
        atm.display();
        atm.run();
        atm.removeCard();

        //Iterator Pattern
        System.out.println("\nIterator PATTERN");
        Song song1 = new Song("Memories");
        Song song2 = new Song("Corporate Life");
        Song song3 = new Song("Cradles");
        List<Song> songs = Arrays.asList(song1, song2, song3);
        PlayList playList = new PlayList(songs);
        ObjectIterator iterator = playList.iterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            song.play();
        }

        // Observer Pattern
        System.out.println("\nObserver PATTERN");
        Channel channel = new Channel();
        Person person1 = new Person("Dhananjai");
        Person person2 = new Person("Varunika");
        channel.subscribe(person1);
        channel.subscribe(person2);
        channel.addVideo("new Video");

        // Memento Pattern
        System.out.println("\nMemento PATTERN");
        TransactionProcess transactionProcess = new TransactionProcess("transaction1");
        TransactionState state = transactionProcess.save();
        while (!transactionProcess.isComplete()) {
            try {
                transactionProcess.processNextStep();
                state = transactionProcess.save();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                transactionProcess.restore(state);
                break;
            }
        }

        //Mediator Pattern
        System.out.println("\nMediator PATTERN");
        Users user1 = new Users(1, "Dhananjai");
        Users user2 = new Users(2, "Varunika");
        Users user3 = new Users(3, "Afsal");
        Message message = new Message("m1", "Hello", user1.getId());
        GroupSpace groupSpace = new GroupSpace();
        groupSpace.addUsers(user1);
        groupSpace.addUsers(user2);
        groupSpace.addUsers(user3);
        groupSpace.addMessage(message);

        // Chain of Responsibility
        System.out.println("\nChain of Responsibility Pattern");
        Request request = new Request();
        RequestHandler logRequestHandler = new LogRequestHandler();
        RequestHandler requestHandler = new AuthRequestHandler();
        RequestHandler finalRequestHandler = new FinalRequestHandler();
        ChainFilter chainFilter = new ChainFilter(logRequestHandler, requestHandler, finalRequestHandler);
        chainFilter.execute(request);

        //Visitor Pattern
        System.out.println("\nVisitor Pattern");
        Book book = new Book("Book1", 10);
        Pen pen = new Pen("Pen1", 2);
        ItemVisitor itemVisitor = new TaxCalculator();
        itemVisitor.execute(book);
        itemVisitor.execute(pen);
    }
}
