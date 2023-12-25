package com.controller;

import com.dao.UserLoginDao;
import com.po.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserLoginController {
    @Autowired
    private UserLoginDao userLoginDao;
    @RequestMapping("login")
    public String UserLogin(UserLogin userLogin,Model model){
        model.addAttribute("userName",userLogin.getUname());
        UserLogin user = userLoginDao.findUser(userLogin);
        if (user!=null){
            return "susses";
        }
        else {
            return "error";
        }
    }
}
