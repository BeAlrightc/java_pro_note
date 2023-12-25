package com.xmcu.demo01;
//切面类：存在多个通知Advice（增强的方法）
public class MyAspect {
    //在UserDao方法之前执行
    public void check_permissions(){
        System.out.println("执行方法之前时---模拟检查权限.....");
    }
     // 在UserDao方法之后执行
    public void log(){
        System.out.println("执行方法之后时---模拟检查日志.....");
    }
}
