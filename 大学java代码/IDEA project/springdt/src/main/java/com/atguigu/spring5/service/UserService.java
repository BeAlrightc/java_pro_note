package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;

public class UserService {
    //创建User类型属性，生成set方法
    private UserDao c;

    public void setC(UserDao c) {
        this.c = c;
    }

    public void add(){
        System.out.println("service add...........");
        c.update();

    }

}
