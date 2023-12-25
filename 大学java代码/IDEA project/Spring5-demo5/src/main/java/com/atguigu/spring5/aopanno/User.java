package com.atguigu.spring5.aopanno;

import org.springframework.stereotype.Component;

//被增强的类
@Component//创建对象
public class User {
    public void add(){
        System.out.println("add方法执行成功");
    }
}
