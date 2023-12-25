package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

public interface UserMapper {

    //获取全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);
    //修改用户
    int updateById(User user);
    //删除用户
    int deleteUser(int id);



}
