package com.xmcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class datecontroller {
    @RequestMapping("/getBirthday")
        public void getBirthday(Date birthday) {
        System.out.println("birthday="+birthday);
    }
}
