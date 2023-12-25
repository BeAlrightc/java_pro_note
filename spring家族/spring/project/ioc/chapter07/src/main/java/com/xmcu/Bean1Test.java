package com.xmcu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean1Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationBean1.xml");
        Bean1 bean = (Bean1)applicationContext.getBean("bean1");//Bean获取对象
        System.out.println(bean);
    }
}
