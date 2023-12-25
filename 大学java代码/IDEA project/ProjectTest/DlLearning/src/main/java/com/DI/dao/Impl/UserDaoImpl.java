package com.DI.dao.Impl;

import com.DI.dao.UserDao;

//创建一个业务逻辑接口
public class UserDaoImpl implements UserDao {


    public boolean login(String name, String password) {
        //如果名字是比尔和密码是123456就返回true
        if(name.equals("比尔")&&password.equals("12345")){
            return true;
        }
        return false;
    }
}
