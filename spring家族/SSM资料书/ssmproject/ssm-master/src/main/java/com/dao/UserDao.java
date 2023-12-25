package com.dao;


import com.po.MyUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
@Mapper
public interface UserDao {
    public List<MyUser> selectUserByUname(MyUser myUser);
}
