package com.designPatterns.creational.prototype.documentClone;

public class Page {
    String content;

    public Page(String content) {
        this.content = content;
    }

    public Page(Page page) {
        this.content = page.content;
    }

    public Page clone() {
        return new Page(this);
    }

    @Override
    public String toString() {
        return "Page{" + "content='" + content + '\'' + '}';
    }
}
