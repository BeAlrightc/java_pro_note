package com.dao;

import com.po.UserLogin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("userLoginDao")
@Mapper
public interface UserLoginDao {
    public UserLogin findUser(UserLogin userLogin);
}
