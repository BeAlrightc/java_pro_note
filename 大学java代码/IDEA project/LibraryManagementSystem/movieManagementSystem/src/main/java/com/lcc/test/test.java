package com.lcc.test;

import com.lcc.service.AdminService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {



    @Test
    public void test(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring.xml");
        AdminService adminService = (AdminService) applicationContext.getBean("adminServiceImpl");

        System.out.println(adminService.login().getMessage());
    }
}
