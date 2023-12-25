package com.atguigu.spring5.aopanno.test;

import com.atguigu.spring5.aopanno.User;
import com.atguigu.spring5.aopanno.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void testAopAnno(){
        //加载配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //获取对象
        User user=context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAopXml(){
        //加载配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        //获取对象
       Book book = context.getBean("book",Book.class);
       book.buy();
    }
}
