package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface UserMapper {
    @Select("select * from user")
List<User> getUsers();
    //方法中如果有多个参数一定要加上@Param
    @Select("select * from user where id =#{id}")
    User getUserById(@Param("id") int id);
    @Insert("insert into user(id,name,pwd)values (#{id},#{name},#{password})")
    int adduser(User user);
    @Update("update user set name=#{name},pwd=#{password} where id =#{id}")
    int updateUser(User user);
    @Delete("delete from user where id =#{id}")
    int deleteUser(@Param("id") int id);
}