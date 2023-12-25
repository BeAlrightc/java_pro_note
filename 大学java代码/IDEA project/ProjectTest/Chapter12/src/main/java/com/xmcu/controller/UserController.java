package com.xmcu.controller;

import com.xmcu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @RequestMapping("/getUserId")
    public void getUserId(HttpServletRequest request){
        String userid =request.getParameter("userid");
        System.out.println("userid="+userid);
    }
    @RequestMapping("/getUserNameAndId")
    public void getUserNameAndId(String username,Integer id){
        System.out.println("username="+username+",id="+id);
    }
    @RequestMapping("/getUserName")
    public void getUserName(@RequestParam(value="name",required = false,defaultValue = "xmcu") String username){
        System.out.println("username="+username);
    }
    @RequestMapping("/user/{name}")
    public void getPathVariable(@PathVariable(value="name") String username){
        System.out.println("username="+username);
    }


    @RequestMapping("/registerUser")
    public String registerUser(User user){
        String username=user.getUsername();
        String password = user.getPassword();
        System.out.println("username="+username+",password="+password);
        return "register";
    }

    @RequestMapping("/findOrderWithUser")
    public void findOrderWithUser(User user){
        String username=user.getUsername();
        String orderId=user.getOrder().getOrderId();
        System.out.println("username="+username+",orderId="+orderId);
    }


}
