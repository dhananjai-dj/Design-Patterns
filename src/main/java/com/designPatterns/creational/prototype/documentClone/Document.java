package com.designPatterns.creational.prototype.documentClone;

import java.util.ArrayList;
import java.util.List;

public class Document implements Cloneable {
    private final String     name;
    private       List<Page> pages = new ArrayList<>();

    public Document(String name) {
        this.name = name;
    }

    public void addPage(Page page) {
        pages.add(page);
    }

    @Override
    public Document clone() {
        try {
            Document clone = (Document) super.clone();
            clone.pages = new ArrayList<>();
            for (Page page : this.pages) {
                clone.pages.add(page.clone());
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Document{" + "name='" + name + '\'' + ", pages=" + pages + '}';
    }
}
