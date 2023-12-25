package ceshi.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//注解法设置相应的异常处理，当遇到相应的异常时自动跳转到一个包含错误信息的页面
@ControllerAdvice
public class ExceptionController {
//括号类里面设置要处理的异常的的类型
    @ExceptionHandler(value ={ArithmeticException.class,NullPointerException.class})
    //以下那个属性是用来将异常信息共享在请求域中的键 <p th:text="${ex}"></p>来调用
    public  String testException(Exception ex, Model model){
        model.addAttribute("ex",ex);
    return "error";
    }
}
