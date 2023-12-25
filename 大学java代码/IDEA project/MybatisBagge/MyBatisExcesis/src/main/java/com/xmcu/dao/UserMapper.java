package com.xmcu.dao;

import com.xmcu.pojo.User;

import java.util.List;

public interface UserMapper {
    //查询所有用户
    List<User> getUserList();
//根据id查询一个用户
    User getUserById(int id);
    //insert 一个用户
    int addUser(User user);
//修改一个用户
    int updateUser(User user);
//删除一个用户
    int deleteUser(int id);

}
