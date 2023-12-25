package com.xmcu.dao;

import com.xmcu.pojo.Users;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface UsersMapper {
    //一对多进行查询
    @Select("select * from tb_user where id=#{id}")
    @Results({@Result(id = true,column = "id",property = "id"),
    @Result(column = "username",property = "username"),
    @Result(column = "address",property = "address"),
    @Result(column = "id",property = "ordersList",
    many=@Many(select=
    "com.xmcu.dao.OrdersMapper.selectOrdersByUserId"))})
    Users selectUserById(int id);
}
