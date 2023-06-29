package com.zhanghd.designpattern.visitor.visitor;

public interface Product {
    void accept(ProductVisitor visitor);
}
