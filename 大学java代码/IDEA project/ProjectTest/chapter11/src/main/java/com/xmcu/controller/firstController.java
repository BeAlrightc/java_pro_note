package com.xmcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class firstController {
    @RequestMapping("/fail")
    public String fail(){
        return "fail";
    }
}
