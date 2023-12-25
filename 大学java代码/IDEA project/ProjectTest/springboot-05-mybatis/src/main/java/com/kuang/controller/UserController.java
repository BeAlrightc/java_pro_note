package com.kuang.controller;

import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        System.out.println("进入了这里");
        List<User> userList=userMapper.queryUserList();
        for(User user: userList){
            System.out.println(user);
        }
        return userList;
       }
       //添加一个用户
    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(3,"阿毛","12345"));
        return "ok";
    }
    //修改一个用户
    @GetMapping("/updateUser")
    public String updateUser(){
        userMapper.updateUser(new User(3,"阿meng","12345"));
        return "OK";
    }
    //根据ID删除用户
    @GetMapping("/deleteUser")
    public String deleteUser(){
        userMapper.deleteUser(3);
        return "OK";
    }
}
