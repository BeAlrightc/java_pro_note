package com.xmcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class firstController {
    @RequestMapping("/first")
    public void first(){
        System.out.println("hello,用get请求");

    }
}
