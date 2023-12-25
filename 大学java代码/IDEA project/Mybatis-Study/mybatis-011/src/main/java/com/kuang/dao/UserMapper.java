package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

public interface UserMapper {
    //查询所有用户
    List<User> getUserList();
    //根据ID查询用户操作
   User SelectById(int id);
   //插入用户
    int InsertUser(User user);
   //修改用户
    int updateUser(User user);
    //删除用户
    int deleteUser(int id);

}
