package com.lcc.controller;

import com.lcc.mapper.AdminMapper;
import com.lcc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @Autowired
    AdminService adminService;
    @Autowired
    AdminMapper adminMapper;

    @RequestMapping("/tests")
    public String test(){
        System.out.println(adminService.login().getObject()+" "+adminService.login().getMessage()+" "+adminService.login().getCode());;
        return "/test";
        }
    }








































































































































