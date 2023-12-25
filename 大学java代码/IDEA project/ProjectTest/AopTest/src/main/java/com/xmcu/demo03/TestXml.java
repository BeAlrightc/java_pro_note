package com.xmcu.demo03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXml {
    public static void main(String[] args) {
        //加载配置类
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        //获取SpringIOC创建的对象
        UserDao userDao= context.getBean("userDao",UserDao.class);
        //分别调用删除，插入，查询，更新方法操作
        userDao.delete();
        System.out.println();
        userDao.insert();
        System.out.println();
        userDao.select();
        System.out.println();
        userDao.update();
        System.out.println();

    }
}
