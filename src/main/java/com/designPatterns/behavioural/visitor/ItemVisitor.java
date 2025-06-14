package com.designPatterns.behavioural.visitor;

public interface ItemVisitor {
    void execute(Book book);
    void execute(Pen pen);
}
