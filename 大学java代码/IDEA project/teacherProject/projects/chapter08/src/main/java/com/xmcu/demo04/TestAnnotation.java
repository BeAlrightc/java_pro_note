package com.xmcu.demo04;

import com.xmcu.demo03.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: TestAnnotation
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2022/3/31 15:17
 */
public class TestAnnotation {
    public static void main(String[] args){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext-Anno.xml");
        UserDao userDao = context.getBean("userDao", UserDao.class);
        userDao.delete();
        System.out.println();
        userDao.insert();
        System.out.println();
        userDao.select();
        System.out.println();
        userDao.update();
    }
}
