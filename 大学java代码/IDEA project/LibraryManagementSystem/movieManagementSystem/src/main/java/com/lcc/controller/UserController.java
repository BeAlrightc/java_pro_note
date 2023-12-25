package com.lcc.controller;

import com.lcc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/test")
    public String test1(){
        System.out.println(userService.selUserAllById(2));
        return "users";
    }
    @RequestMapping("/test")
    public String test(){
        System.out.println(userService.selectAll());
        return "users";
    }
}
