package com.zhanghd.designpattern.visitor.element;

import com.zhanghd.designpattern.visitor.visitor.ProductVisitor;

public interface Product {
    void accept(ProductVisitor visitor);
}
