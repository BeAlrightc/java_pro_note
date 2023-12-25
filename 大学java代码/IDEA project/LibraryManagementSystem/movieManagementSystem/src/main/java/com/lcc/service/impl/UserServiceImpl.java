package com.lcc.service.impl;

import com.lcc.mapper.UserMapper;
import com.lcc.pojo.User;
import com.lcc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User selUserAllById(int id) {
        return userMapper.selUserAllById(id);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }


}
