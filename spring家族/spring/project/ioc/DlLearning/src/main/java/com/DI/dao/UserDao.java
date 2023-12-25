package com.DI.dao;
//创建一个业务逻辑接口
public interface UserDao {
    //定义一个方法用于模拟登录功能的实现
    public boolean login(String name,String password);
}
