package com.xmcu.dao.impl;

import com.xmcu.dao.UserDao;

public class UserDaoImpl implements UserDao
{
//重写接口定义的login方法
    public boolean login(String name, String password) {
        if(name.equals("张三")&&password.equals("123")){
            return true;
        }
        return false;
    }
}
