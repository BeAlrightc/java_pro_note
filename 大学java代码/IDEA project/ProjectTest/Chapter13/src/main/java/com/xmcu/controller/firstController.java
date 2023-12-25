package com.xmcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class firstController {
    @RequestMapping("/first")
    public void firstVisit(){
        System.out.println("访问成功");
    }
}
