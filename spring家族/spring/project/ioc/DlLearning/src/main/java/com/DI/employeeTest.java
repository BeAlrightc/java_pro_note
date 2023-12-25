package com.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class employeeTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new
                ClassPathXmlApplicationContext("bean6.xml");
        Employee employee = applicationContext.getBean("employee",Employee.class);
        System.out.println(employee);
    }
}
