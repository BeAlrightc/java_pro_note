package ceshi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
@RequestMapping("/**/testInterceptor")
    public String testIntercepter(){
        return "success";
    }
//处理算数异常
    @RequestMapping("/testExceptionHandler")
    public String testExceptionHandler(){
        System.out.println("AAAA"+1/0);
        return "success";
    }
}




