package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/hello")
public class RequestMappingController {

    @RequestMapping(
            value = {"/testRequestMapping", "/test"},
            method = {RequestMethod.GET, RequestMethod.POST},
            params = {"username="}
    )
    public String success() {
        return "success";
    }

    @GetMapping("/testGetMapping")
    public String testGetMapping() {
        return "success";
    }

    @RequestMapping(value = "/testput", method = RequestMethod.PUT)
    public String testput() {
        return "success";
    }

    @RequestMapping(
            value = {"/testParamsAndHeaders"},//value中满足其中的一个就可以
            params = {"username", "password!=123456"}, //params中设置的条件必须同时满足
            headers = {"Host=localhost:8080"}
    )
    public String testParamsAndHeaders() {
        return "success";
    }

    //@RequestMapping("/a?a/testAnt")
    //@RequestMapping("/a*a/testAnt")
    @RequestMapping("/**/testAnt")
    public String testAnt() {
        return "success";
    }

    @RequestMapping("/testPath/{id}/{username}")
    public String testPath(@PathVariable("id")Integer id,@PathVariable("username") String username){
        System.out.println("id:"+id+",username:"+username);
        return "success";
    }
}