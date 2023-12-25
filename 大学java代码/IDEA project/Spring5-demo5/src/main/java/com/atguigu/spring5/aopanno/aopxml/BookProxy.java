package com.atguigu.spring5.aopanno.aopxml;
//增强类
public class BookProxy {
    public void before(){
        System.out.println("before.....");
    }
    public void after(){
        System.out.println("在后面执行啦。。。");
    }
}
