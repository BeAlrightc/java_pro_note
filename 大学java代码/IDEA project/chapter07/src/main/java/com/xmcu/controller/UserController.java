package com.xmcu.controller;

import com.xmcu.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {
    //注入服务层
    @Resource(name="userService")
    private UserService userService;
    public void save(){
        this.userService.save();
        System.out.println("执行UserController.save()");
    }
}
