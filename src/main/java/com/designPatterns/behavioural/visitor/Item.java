package com.designPatterns.behavioural.visitor;

public interface Item {
    void calculateTax(ItemVisitor itemVisitor);
}
