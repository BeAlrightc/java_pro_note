package com.xmcu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean2Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationBean2.xml");
        System.out.println(applicationContext.getBean("bean2"));//直接使用applicationContext获取bean的操作
    }
}
