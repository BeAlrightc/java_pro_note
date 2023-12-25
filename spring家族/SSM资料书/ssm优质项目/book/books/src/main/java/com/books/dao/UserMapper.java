package com.books.dao;

import com.books.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper<String> {
    //删除操作
    int deleteByPrimaryKey(String userid);
//插入用户
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
//通过用户ID查找用户
    User findUserByUserId(String userid);
}