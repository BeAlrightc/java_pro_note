package com.xmcu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean3Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("applicationBean3.xml");
        System.out.println(applicationContext.getBean("bean3"));
    }
}
