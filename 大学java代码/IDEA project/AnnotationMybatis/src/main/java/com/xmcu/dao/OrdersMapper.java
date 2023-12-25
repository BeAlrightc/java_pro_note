package com.xmcu.dao;

import com.xmcu.pojo.Orders;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrdersMapper {
    @Select("select * from tb_orders where user_id=#{id}")
    @Results({@Result(id = true,column = "id",property = "id"),
    @Result(column = "number",property = "number")})
    List<Orders> selectOrdersByUserId(int user_id);

//    @Select("select * from tb_orders where id=#{id}")
//    @Results({@Result(id=true,column = "id",property = "id"),
//    @Result(column ="number",property = "number",
//    @Result(column = "id",property = "productList",
//    many=@Many(select=
//    "com.xmcu.dao.ProductMapper.selectProductByOrdersId"))})
//    Orders selectOrdersById(int id);

    @Select("select * from tb_orders where id=#{id}")
    @Results({@Result(id=true,column = "id",property = "id"),
    @Result(column = "number",property = "number"),
    @Result(column = "id",property = "productList",
    many = @Many(select ="com.xmcu.dao.ProductMapper.selectProductByOrdersId"))})
    Orders selectOrdersById(int id);
}
