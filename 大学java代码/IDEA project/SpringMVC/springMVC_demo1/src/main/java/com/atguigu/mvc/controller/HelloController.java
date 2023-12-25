package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //通过注解进行标识,并创建对象
public class HelloController {

    //"/"-->/WEB-INF/templates/index.html
    @RequestMapping(value="/")
    public String index(){
        //返回试图名称
        return "index";
    }
    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
    @RequestMapping("/testF")
    public String toFile(){
        return "file";
    }

}
