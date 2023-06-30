package com.zhanghd.designpattern.visitor.objectStructure;

import com.zhanghd.designpattern.visitor.concreteElement.Beverage;
import com.zhanghd.designpattern.visitor.concreteElement.Fruit;
import com.zhanghd.designpattern.visitor.concreteElement.Vegetable;
import com.zhanghd.designpattern.visitor.element.Product;
import com.zhanghd.designpattern.visitor.visitor.ProductVisitor;

import java.util.ArrayList;
import java.util.List;


/**
 *  @author: zhanghd
 *  @Date: 2023/6/29 4:54 PM
 *  @email: zhang-haodi@smtp.telek.com.cn
 *  @Description: 此对象结构包含各种元素，而且要求元素稳定且可以迭代访问这些元素。
 *                  此处SuperMarket中用集合存储商品元素，商品元素是稳定的，用过访问者 Promotion 和 Salesman
 *                  来修改元素中的属性，使得集合中元素在没有产生变动的情况下，实现原价 -> 打折的业务逻辑改变
 */
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
