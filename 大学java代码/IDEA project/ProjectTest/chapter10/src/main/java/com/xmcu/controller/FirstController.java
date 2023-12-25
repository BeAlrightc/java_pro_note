package com.xmcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
        @RequestMapping("/firstController")
    public String sayHello(){
        System.out.println("成功地访问到FirstController!");
        return "success";
    }

}
