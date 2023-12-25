package com.xmcu.demo04;

import com.xmcu.demo03.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: TestAnnotation
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2022/5/12 15:17
 */
public class TestAnnotation {
    public static void main(String[] args){
        //加载配置文件
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext-Anno.xml");
        //获得对象
        UserDao userDao = context.getBean("userDao", UserDao.class);
        //调下列的删除，插入，查询，更新的方法操作
        userDao.delete();
        System.out.println();
        userDao.insert();
        System.out.println();
        userDao.select();
        System.out.println();
        userDao.update();
    }
}
