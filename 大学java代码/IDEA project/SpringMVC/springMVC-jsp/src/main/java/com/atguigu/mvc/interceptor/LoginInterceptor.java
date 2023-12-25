package com.atguigu.mvc.interceptor;

import com.atguigu.mvc.po.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       //获取请求的URL
        String url =request.getRequestURI();
        //URL：除了lolgin.jsp是可以公开访问的，其他的URL都进行拦截
        if(url.indexOf("/login")>=0){
            return true;
        }
        //获取session
        HttpSession session =request.getSession();
        User user =(User) session.getAttribute("USER_SESSION");
        //判断Session中是否有用户数据，如果有，则返回true,继续向下执行
        if(user !=null){
            return true;
        }
        //不符合条件的给出提示信息，并转发到登录页面
        request.setAttribute("msg","您还没有登录，请先登录！");
        request.getRequestDispatcher("/WEB-INF/templates/login.jsp").forward(request,response);
        return false;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
