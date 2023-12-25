package com.kuang.mapper;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//表示这个注解这是一个mybatis的mapper类
@Mapper
@Repository
public interface UserMapper {
//查询全部user将它们放进一个集合当中
    List<User> queryUserList();
//通过id查询user
    User queryuserById(int id);
//添加一个user
    int addUser(User user);
//删除一个user
    int deleteUser(int id);
//更新一个user信息
    int updateUser(User user);
}
