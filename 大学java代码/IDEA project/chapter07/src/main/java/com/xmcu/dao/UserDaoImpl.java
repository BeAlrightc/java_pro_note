package com.xmcu.dao;

import com.xmcu.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
@Repository("userDao")
public class UserDaoImpl implements UserDao{
  //  @Test
    public void save() {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("appliactionContext.xml");
        User user =(User)applicationContext.getBean("user");
        System.out.println(user);
        System.out.println("执行UserDaoImpl.save()");
    }
}
