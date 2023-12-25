package com.xmcu.controller;

import com.xmcu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageController {
    @RequestMapping("/register")
    public void showPageByViod(){
        System.out.println("showPageByVoid running");
    }



    @RequestMapping("/showPageByForward")
    public String showPageByForward(){
        System.out.println("showPageByForward running");
        return"forward:orders1.jsp";
    }
    @RequestMapping("/showPageByRedirect")
    public String showPageByRedirect(){
        System.out.println("shoPageByRedirect running");
        return"redirect:http://www.baidu.com";
    }

    @RequestMapping("/showPageByRequest")
    public String showPageByRequest(HttpServletRequest request){
        System.out.println("showPageByRequest running");
        request.setAttribute("username","request");
        return "register";
    }
    @RequestMapping("/showPageByModel")
    public String showPageByModel(Model model){
        System.out.println("showPageByModel running");
        model.addAttribute("username","model");
        User user = new User();
        model.addAttribute("user",user);
        return "register";
    }
//20025020217黎小凤
    @RequestMapping("/showModelAndView")
    public ModelAndView showModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username","黎小凤200250217");
        User user=new User();
        user.setPassword("password");
        modelAndView.addObject("user",user);
        //设置返回视图名称
        modelAndView.setViewName("register");
        return modelAndView;
    }
}
