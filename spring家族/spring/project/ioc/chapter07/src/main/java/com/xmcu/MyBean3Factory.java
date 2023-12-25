package com.xmcu;

public class MyBean3Factory {
    public MyBean3Factory() {
        System.out.println("bean3工厂实例化中，使用了MyBean3Factory构造方法");
    }
    public Bean3 createBean(){//创建Bean3实例的方法
        return new Bean3();
    }
}
