package com.atguigu.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository(value="userDaoImpl1")//建立一个对象，其名为：userDaoImpl1
public class UserDaoImpl implements UserDao{
    public void add() {
        System.out.println("dao dao。。。。。");
    }
}
