package com.lcc.mapper;

import com.lcc.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    //根据id查询用户
    public User selUserAllById(int id);
    //查询所用户
   List<User> selectAll();

}
