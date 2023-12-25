package com.atguigu.mvc.controller;

import com.atguigu.mvc.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    /*
    向用户登录界面跳转
     */
    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String toLogin(){
        return "login";
    }
    /*
    用户登录
     */
    public String login(User user, Model model, HttpSession session){
        //获取用户名和密码
        String username = user.getUsername();
        String password = user.getPassword();
        //此处摸你从数据库中获取用户名和密码进行判断
        if(username !=null && username.equals("xiaoxue")
        && password !=null && password.equals("123456")){
            //将用户对象添加到session
            session.setAttribute("USER_SESSION",user);
            //重定向到主页面的跳转方法
           return "redirect:main";
        }
        model.addAttribute("msg","用户名或密码错误，请重新登录！");
        return "login";
    }
    /**
     * 向主页面跳转
     */
    @RequestMapping(value="/main")
    public String toMain(){
        return "mian";
    }
    /**
     * 退出登录
     */

    public  String logout(HttpSession session){
        //清除Session
        session.invalidate();
        //重定向到登录页面的跳转方法
        return "redirect:login";
    }
}
