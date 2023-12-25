package com.xmcu.Test;

import com.xmcu.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("appliactionContext.xml");
        UserController usercontroller = (UserController)
                applicationContext.getBean("userController");
    usercontroller.save();
    }
}
