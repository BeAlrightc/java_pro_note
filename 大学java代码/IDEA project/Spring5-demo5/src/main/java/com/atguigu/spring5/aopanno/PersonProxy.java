package com.atguigu.spring5.aopanno;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component//创建一个对象
@Aspect//生成一个代理对象
@Order(1)//在增强类上面添加一个注解@Order(数字类型值)，数字类型值越小优先级越高
public class PersonProxy {
    //后置通知（返回通知）
    @Before(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("Person Before.......");

    }
}
