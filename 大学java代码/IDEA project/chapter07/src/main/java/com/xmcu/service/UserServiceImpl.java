package com.xmcu.service;

import com.xmcu.dao.UserDao;
import org.junit.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{
    //使用注解@Rsource注入UserDao
    @Resource(name="userDao")
    private UserDao userDao;
    public void save() {
      this.userDao.save();
        System.out.println("执行UserServiceImpl.save");

    }
}
