package com.xmcu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class scopeTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new
                ClassPathXmlApplicationContext("applicationBean4.xml");
        Bean1 bean1 = (Bean1)applicationContext.getBean("bean1");
        System.out.println(bean1);
        Bean1 bean2 = (Bean1)applicationContext.getBean("bean1");
        System.out.println(bean2);

        if(bean1==bean2){//增加一个判断
            System.out.println("他们是同一个实例");
        }else{
            System.out.println("他们不是同一个实例");
        }
        System.out.println(bean1==bean2);
    }
}
