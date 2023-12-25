package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testBook1(){
        //1.加载spring配置文件
      ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        Book book = context.getBean("book",Book.class);
        System.out.println(book);
        //用获取的对象进行调用Book类当中的testDemo()方法。
        book.testDemo();
    }
}
