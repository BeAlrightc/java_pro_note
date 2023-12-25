package com.DI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestUser2 {
    public static void main(String[] args) {
        //加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean2.xml");
        //获取bean创建的对象
        User2 user2 = applicationContext.getBean("user2", User2.class);
        System.out.println(user2);
    }
}
