package com.designPatterns.creational.prototype.documentClone;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Design Patterns");
        Page page1 = new Page("page1 content");
        Page page2 = new Page("page2 content");
        Page page3 = new Page("page3 content");
        document.addPage(page1);
        document.addPage(page2);
        document.addPage(page3);

        Page clonedPage = page1.clone();
        System.out.println(clonedPage + " -> this is cloned page");


        Document clone = document.clone();
        System.out.println(document);
        System.out.println(clone);
        System.out.println(document == clone);
    }
}
