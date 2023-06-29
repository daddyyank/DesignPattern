package com.zhanghd.designpattern.visitor.products;

import com.zhanghd.designpattern.visitor.visitor.Product;
import com.zhanghd.designpattern.visitor.visitor.ProductVisitor;
import lombok.Data;

/**
 *  @author: zhanghd
 *  @Date: 2023/6/28 5:14 PM
 *  @email: zhang-haodi@smtp.telek.com.cn
 *  @Description: 商品 -> 酒水
 */
@Data
public class Beverage implements Product {
    /**
     * 名称
     */
    String name;

    /**
     * 价格
     */
    double price;

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}
