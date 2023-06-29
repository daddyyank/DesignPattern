package com.zhanghd.designpattern.visitor;

import com.zhanghd.designpattern.visitor.products.Beverage;
import com.zhanghd.designpattern.visitor.products.Fruit;
import com.zhanghd.designpattern.visitor.products.Vegetable;

public interface ProductVisitor {

    void visit(Fruit fruit);
    void visit(Beverage beverage);
    void visit(Vegetable vegetable);
}
