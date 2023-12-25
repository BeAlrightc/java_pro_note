package com.books.controller;

import javax.servlet.http.HttpSession;

import com.books.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.books.service.UserService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//注入对象
@Controller
public class LoginController {
	//注入属性
	@Autowired
	private UserService userService;
//请求处理操作
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String checkUser(@RequestParam(name = "userid") String userid,String password,HttpSession session) {
		User user = userService.findUserByUserId(userid);
		if (user != null && user.getPassword().equals(password)) {
			session.setAttribute("userInfo", user);
			return "index";
		}
		return "../../login";
	}
	//欢迎页
	@RequestMapping("/welcome")
	public String openWelcomePage(Model model) {
		return "welcome";
	}
}
