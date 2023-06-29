package com.zhanghd.designpattern.visitor.concreteElement;


import com.zhanghd.designpattern.visitor.element.Product;
import com.zhanghd.designpattern.visitor.visitor.ProductVisitor;
import lombok.Data;

/**
 *  @author: zhanghd
 *  @Date: 2023/6/28 5:14 PM
 *  @email: zhang-haodi@smtp.telek.com.cn
 *  @Description: 商品 -> 水果
 */
@Data
public class Fruit implements Product {

    /**
     * 名称
     */
    String name;

    /**
     * 价格
     */
    double price;

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}
