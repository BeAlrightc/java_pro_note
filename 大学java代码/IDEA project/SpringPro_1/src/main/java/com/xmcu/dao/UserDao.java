package com.xmcu.dao;
//创建一个UserDao接口
public interface UserDao {
    public boolean login(String name,String password);//创建一个登录的方法供实现类重写
}
