package com.zhanghd.designpattern.visitor.element;

import com.zhanghd.designpattern.visitor.visitor.ProductVisitor;


/**
 *  @author: zhanghd
 *  @Date: 2023/6/29 4:50 PM
 *  @email: zhang-haodi@smtp.telek.com.cn
 *  @Description: 产品抽象类，通过接待方法accept将自身传递给访问者供其实现一些业务逻辑
 */
public interface Product {
    void accept(ProductVisitor visitor);
}
