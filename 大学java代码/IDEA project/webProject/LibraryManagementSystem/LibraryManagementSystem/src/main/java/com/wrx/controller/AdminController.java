package com.wrx.controller;

import com.wrx.mapper.AdminMapper;
import com.wrx.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @Autowired
    AdminService adminService;
    @Autowired
    AdminMapper adminMapper;

    @RequestMapping("/test")
    public String test(){
        System.out.println(adminMapper.test(1));
        return "/test";
    }
}
