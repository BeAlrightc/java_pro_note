package com.xmcu;

public class MyBean2Factory {
    public MyBean2Factory() {
        System.out.println("使用了MyBean2Factory的构造方法");//测试操作
    }

    //使用MyBean2Factory类的工厂创建Bean2，记住，是静态方法
    public static Bean2 createBean(){
        return new Bean2();
    }
}
