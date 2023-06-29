package com.zhanghd.designpattern.visitor.visitor;

import com.zhanghd.designpattern.visitor.concreteElement.Beverage;
import com.zhanghd.designpattern.visitor.concreteElement.Fruit;
import com.zhanghd.designpattern.visitor.concreteElement.Vegetable;

public interface ProductVisitor {

    void visit(Fruit fruit);
    void visit(Beverage beverage);
    void visit(Vegetable vegetable);
}
