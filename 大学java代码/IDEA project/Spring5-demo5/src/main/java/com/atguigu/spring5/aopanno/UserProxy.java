package com.atguigu.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强的类
@Component
@Aspect //生成代理对象
@Order(3)
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void pointdemo(){

    }


    //前置通知
    //@Before注解表示作为前置通知指定哪个类哪个方法进行增强
    @Before(value="pointdemo()")
    public void before(){
        System.out.println("前置通知执行成功");
    }
//后置通知（返回通知）
    @AfterReturning(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("AfterReturning.....");

    }

//最终通知
 @After(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void after(){
     System.out.println("后置通知执行成功！！！");

 }
//异常通知
    @AfterThrowing(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("AfterThrowing..出现异常");

    }

    //环绕通知就是在被增强的方法之前或者之后执行的一个通知
    @Around(value="execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前.....");

        //被增强的方法执行
        proceedingJoinPoint.proceed();


        System.out.println("环绕之后.......");

    }

}
