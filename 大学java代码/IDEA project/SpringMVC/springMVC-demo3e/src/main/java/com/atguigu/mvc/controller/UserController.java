package com.atguigu.mvc.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Controller;
import org.springframework.util.SocketUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    private String username;
    private String password;

    /**
     * 使用RESTFUL模拟用户资源的增删改查
     * /users GET 查询所有用户信息
     * /user/1 GET 根据用户id查询所有用户信息查询用户信息
     * /user post 添加用户信息
     * /user/1 DELETE 删除用户信息
     * /user PUT 修改用户信息
     */
    @RequestMapping(value="/user",method = RequestMethod.GET )
    public String getAlluser(){
        System.out.println("查询用户所有信息");
        return "success";
    }

    @RequestMapping(value="/user/{id}",method = RequestMethod.GET)
    public String getUserById(){
        System.out.println("根据id查询用户信息");
        return "success";
    }

    @RequestMapping(value="/user",method=RequestMethod.POST)
    public String insertUser(String username, String password){
        this.username = username;
        this.username = username;
        this.password = password;
        this.password = password;
        System.out.println("添加用户信息："+username+","+password);
        return "success";
    }

    @RequestMapping(value="/usr",method = RequestMethod.PUT)
    public String updateuser(String username, String password){
        System.out.println("修改用户信息："+username+","+password);
        return "success";
    }
}
