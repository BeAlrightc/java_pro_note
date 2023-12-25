package com.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class userConstrtTest {
    public static void main(String[] args) {
        //加载配置文件，并且创建该实例
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("bean1.xml");
        //获取创建的对象实例
        User user = applicationContext.getBean("user1",User.class);
        //输出对象值
        System.out.println(user);
    }

}
