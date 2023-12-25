package com.xmcu.service.impl;

import com.xmcu.dao.UserDao;
import com.xmcu.service.UserService;

/**
 * @Title: UserServiceImpl
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2022/3/22 14:55
 */
public class UserServiceImpl implements UserService {
    UserDao userDao;
    public void setUserDao(UserDao userDao)
    { this.userDao=userDao; }

    @Override
    public boolean login(String name, String password) {
        return userDao.login(name,password);
    }
}
