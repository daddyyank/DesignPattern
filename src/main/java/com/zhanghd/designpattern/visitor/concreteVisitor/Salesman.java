package com.zhanghd.designpattern.visitor.concreteVisitor;

import com.zhanghd.designpattern.visitor.concreteElement.Beverage;
import com.zhanghd.designpattern.visitor.concreteElement.Fruit;
import com.zhanghd.designpattern.visitor.concreteElement.Vegetable;
import com.zhanghd.designpattern.visitor.visitor.ProductVisitor;


/**
 *  @author: zhanghd
 *  @Date: 2023/6/29 4:49 PM
 *  @email: zhang-haodi@smtp.telek.com.cn
 *  @Description: 访问者 -> 售货员
 */
public class Salesman implements ProductVisitor {
    @Override
    public void visit(Fruit fruit) {
        System.out.println("不过年不过节" + fruit.getName() + "原价" + fruit.getPrice());
    }

    @Override
    public void visit(Beverage beverage) {
        System.out.println("不过年不过节" + beverage.getName() + "原价" + beverage.getPrice());
    }

    @Override
    public void visit(Vegetable vegetable) {
        System.out.println("不过年不过节" + vegetable.getName() + "原价" + vegetable.getPrice());
    }
}
