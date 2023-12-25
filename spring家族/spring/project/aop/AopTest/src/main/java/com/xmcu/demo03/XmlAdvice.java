package com.xmcu.demo03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class XmlAdvice {
    //前置通知
    public void before(JoinPoint joinPoint){
        System.out.println("这是前置通知");
        System.out.println("目标类："+joinPoint.getTarget());
        System.out.println(",被织入增强处理的目标方法为："+
                joinPoint.getSignature().getName());
    }
    //返回通知
    public void aferReturning(JoinPoint joinPoint){
        System.out.println("这是返回通知（方法不出现异常时调用）！");
        System.out.println("被织入增强处理的目标方法为："+
                joinPoint.getSignature().getName());
    }
    /**
     * 环绕通知
     * ProceedingJoinPoint是JoinPoint子接口，表示可以执行目标方法
     * 1.必须是Object类型的返回值
     * 2.必须接受一个参数，类型为ProceedJoinPoint
     * 3.必须throws throwable
     */
    public Object around(ProceedingJoinPoint point)throws Throwable{
        System.out.println("这是环绕通知之前的部分！");
        Object object =point.proceed();
        System.out.println("这是环绕通知之后的部分！");
        return  object;
    }
    //异常通知
    public void afterException(){
        System.out.println("异常通知！");
    }
    //后置通知
    public void after(){
        System.out.println("这是后置通知！");
    }

}
