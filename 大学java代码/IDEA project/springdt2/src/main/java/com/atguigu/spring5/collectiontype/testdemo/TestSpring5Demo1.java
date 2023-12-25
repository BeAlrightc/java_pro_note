package com.atguigu.spring5.collectiontype.testdemo;

import com.atguigu.spring5.collectiontype.Book;
import com.atguigu.spring5.collectiontype.Course;
import com.atguigu.spring5.collectiontype.Stu;
import com.atguigu.spring5.collectiontype.autowire.Emp;
import com.atguigu.spring5.collectiontype.bean.Orders;
import com.atguigu.spring5.collectiontype.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5Demo1 {
    @Test
    public void testCollection1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
       Stu stu =  context.getBean("stu", Stu.class);
       stu.test();
    }

    @Test
    public void testCollection2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 =  context.getBean("book", Book.class);
        Book book2 =  context.getBean("book", Book.class);
        //book.test();
        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void testCollection3(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
       Course course =  context.getBean("MyBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void testCollection4(){
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("bean4.xml");
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");
       Orders order =  context.getBean("orders", Orders.class);
        System.out.println("第四步，获取创建bean实例对象");
        System.out.println(order);

        //手动让bean实例销毁
        context.close();
    }


        @Test
        public void testCollection5() {
            ApplicationContext context =
                    new ClassPathXmlApplicationContext("bean5.xml");
            Emp emp = context.getBean("emp", Emp.class);
            System.out.println(emp);
        }
}
