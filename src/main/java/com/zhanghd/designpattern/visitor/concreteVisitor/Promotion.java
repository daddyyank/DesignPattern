package com.zhanghd.designpattern.visitor.concreteVisitor;

import com.zhanghd.designpattern.visitor.concreteElement.Beverage;
import com.zhanghd.designpattern.visitor.concreteElement.Fruit;
import com.zhanghd.designpattern.visitor.concreteElement.Vegetable;
import com.zhanghd.designpattern.visitor.visitor.ProductVisitor;


/**
 *  @author: zhanghd
 *  @Date: 2023/6/29 4:49 PM
 *  @email: zhang-haodi@smtp.telek.com.cn
 *  @Description: 访问者 -> 促销员
 */
public class Promotion implements ProductVisitor {
    @Override
    public void visit(Fruit fruit) {
        fruit.setPrice(fruit.getPrice() * 0.8);
        System.out.println("过年过节" + fruit.getName() + "打折" + fruit.getPrice());
    }

    @Override
    public void visit(Beverage beverage) {
        beverage.setPrice(beverage.getPrice() * 0.8);
        System.out.println("过年过节" + beverage.getName() + "打折" + beverage.getPrice());
    }

    @Override
    public void visit(Vegetable vegetable) {
        vegetable.setPrice(vegetable.getPrice() * 0.8);
        System.out.println("过年过节" + vegetable.getName() + "打折" + vegetable.getPrice());
    }
}
