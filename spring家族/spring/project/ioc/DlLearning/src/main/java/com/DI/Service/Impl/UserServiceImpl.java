package com.DI.Service.Impl;
import com.DI.Service.UserService;
import com.DI.dao.UserDao;
//创建userservice的实现类
public class UserServiceImpl implements UserService {
    //创建一个UserDao类型的类变量
UserDao userDao;
//添加setter方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
//重写userService接口中的方法
    public boolean login(String name, String password) {
        return userDao.login(name,password);
    }
}
