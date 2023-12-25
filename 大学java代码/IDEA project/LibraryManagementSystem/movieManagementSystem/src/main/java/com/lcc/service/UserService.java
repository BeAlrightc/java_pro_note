package com.lcc.service;

import com.lcc.pojo.User;

import java.util.List;

public interface UserService {
    //根据id查询用户
    public User selUserAllById(int id);
    //查询该表中的全部用户
  List<User> selectAll();


}
