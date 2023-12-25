package com.xmcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {
    @RequestMapping(value={"/addUser","/deleteUser"})
    public void checkAuth(){
        System.out.println("增删操作校验");
    }
}
