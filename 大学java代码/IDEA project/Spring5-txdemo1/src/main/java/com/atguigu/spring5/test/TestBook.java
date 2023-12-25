package com.atguigu.spring5.test;

import com.atguigu.spring5.Config.TxConfig;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    @Test
    public void testAccount (){
        //加载配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //获取对象2
       UserService userService = context.getBean("userService", UserService.class);
       //调用方法进行转账操作
        userService.accontMoney();

    }

    @Test
    public void testAccount1 (){
        //加载配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        //获取对象2
        UserService userService = context.getBean("userService", UserService.class);
        //调用方法进行转账操作
        userService.accontMoney();

    }
    @Test
    public void testAccount2 (){
        //加载配置文件
        ApplicationContext context =
                new AnnotationConfigApplicationContext(TxConfig.class);
        //获取对象2
        UserService userService = context.getBean("userService", UserService.class);
        //调用方法进行转账操作
        userService.accontMoney();

    }
}
