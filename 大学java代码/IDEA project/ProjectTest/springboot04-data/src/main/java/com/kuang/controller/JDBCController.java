package com.kuang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {
@Autowired
    JdbcTemplate jdbcTemplate;
     //查询数据库的所有信息
    //没有实体类，数据库的东西，怎么获取？ Map
    //查询表中的所有信息
@GetMapping("/userList")
    public List<Map<String,Object>> userList(){
    System.out.println("进入了这里");
        String sql ="select * from user";
        List<Map<String,Object>> list_maps=jdbcTemplate.queryForList(sql);
        return list_maps;
    }
//增加用户
    @GetMapping("/addUser")
    public String addUser(){
    String sql ="insert into mybatis.user(id,name,pwd) value(5,'熊二','123')";
    jdbcTemplate.update(sql);
    return "udateOK";
    }
    //通过restfiul风格更新数据：就是请求的时候外加入一个参数
    @GetMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") int id){
    String sql = "update mybatis.user set name=?,pwd=? where id="+id;
    Object[] objects=new Object[2];//用一个数组进行封装操作，将参数封装
    objects[0]="小刚";
    objects[1]="zzzzzzzz";
    jdbcTemplate.update(sql,objects);//将sql语句和参数传进去执行
    return "update-ok";
    }
//通过id删除数据，当然也是通过restful风格进行传参
    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id){
    String sql = "delete from mybatis.user where id=?";
    jdbcTemplate.update(sql,id);
    return "update-ok";
    }

}
