package com.DI.test;

import com.DI.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class userTYest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("beanUser.xml");
        UserService userService =(UserService)applicationContext.getBean( "userService");
        boolean flag = userService.login("比尔","12345");
        if(flag){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }

}
