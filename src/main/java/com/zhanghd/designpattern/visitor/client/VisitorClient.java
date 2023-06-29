package com.zhanghd.designpattern.visitor.client;

import com.zhanghd.designpattern.visitor.concreteVisitor.Promotion;
import com.zhanghd.designpattern.visitor.concreteVisitor.Salesman;
import com.zhanghd.designpattern.visitor.objectStructure.SuperMarket;


/**
 *  @author: zhanghd
 *  @Date: 2023/6/29 4:44 PM
 *  @email: zhang-haodi@smtp.telek.com.cn
 *  @Description:访问者模式客户端
 */
public class VisitorClient {
    public static void startProject(){
        SuperMarket bigHuYou= new SuperMarket();
        //可以很轻松的更换Visitor，但是要求BigHuYouCompany的结构稳定
        System.out.println("-----------------售货员卖货--------------------");
        bigHuYou.startProject(new Salesman());
        System.out.println("-----------------促销员卖货--------------------");
        bigHuYou.startProject(new Promotion());
    }

    public static void main(String[] args) {
        startProject();
    }
}
