package com.zhanghd.designpattern.visitor.objectStructure;

import com.zhanghd.designpattern.visitor.concreteElement.Beverage;
import com.zhanghd.designpattern.visitor.concreteElement.Fruit;
import com.zhanghd.designpattern.visitor.concreteElement.Vegetable;
import com.zhanghd.designpattern.visitor.element.Product;
import com.zhanghd.designpattern.visitor.visitor.ProductVisitor;

import java.util.ArrayList;
import java.util.List;

public class SuperMarket {

    private List<Product> product= new ArrayList<>();

    public SuperMarket() {
        product.add(new Fruit("油桃", 4.5));
        product.add(new Vegetable("黄瓜",3));
        product.add(new Beverage("红牛", 6));
    }

    public void startProject(ProductVisitor visitor){
        for (Product slave : product) {
            slave.accept(visitor);
        }
    }
}
