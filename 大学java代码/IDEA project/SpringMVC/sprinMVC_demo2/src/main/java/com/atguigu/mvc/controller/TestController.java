package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "index";

    }

    @RequestMapping("/param")//当浏览器的请求包含此格式时
    public String param(){

        return "test_param";//跳转到test_param这个html页面当中就行访问，。直接访问浏览器不能访问的静态资源当中
    }
}
