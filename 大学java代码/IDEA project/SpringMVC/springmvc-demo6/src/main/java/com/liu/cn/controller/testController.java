package com.liu.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
    @RequestMapping("/testgo")
    public String testc(){
        return "test";
    }
    @RequestMapping("/firstP")
    public String fitst(){
        return"index";
    }
}
