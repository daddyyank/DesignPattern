package com.zhanghd.designpattern.visitor.visitor;

import com.zhanghd.designpattern.visitor.concreteElement.Beverage;
import com.zhanghd.designpattern.visitor.concreteElement.Fruit;
import com.zhanghd.designpattern.visitor.concreteElement.Vegetable;



/**
 *  @author: zhanghd
 *  @Date: 2023/6/29 4:53 PM
 *  @email: zhang-haodi@smtp.telek.com.cn
 *  @Description: 访问者抽象类 通过visit方法 修改product部分属性来实现稳定的改变业务逻辑
 */
public interface ProductVisitor {

    void visit(Fruit fruit);
    void visit(Beverage beverage);
    void visit(Vegetable vegetable);
}
