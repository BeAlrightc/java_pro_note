package com.xmcu.service.Impl;

import com.xmcu.dao.UserDao;
import com.xmcu.service.UserService;

public class UserServiceImpl implements UserService {
    //创建一个UserDao的属性
    UserDao userDao;
//为其创建set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
//创建登录方法，通过应用userDao的login方法
    public boolean login(String name, String password) {
        return userDao.login(name, password);
    }
}
