package com.xmcu.dao.impl;

import com.xmcu.dao.UserDao;

/**
 * @Title: UserDaoImpl
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2022/3/22 14:43
 */
public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String name, String password) {
        if (name.equals("张三")&&password.equals("123")){
            return true;
        }
        return false;
    }
}
