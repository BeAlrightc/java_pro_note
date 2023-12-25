package com.xmcu.demo02;

import com.xmcu.demo01.MyAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    //代理方法
    public Object createProxy(Object target){
        //创建一个动态类对象
        Enhancer enhancer = new Enhancer();
        //确定需要增强的类，设置其父类
        enhancer.setSuperclass(target.getClass());
        //添加回调函数
        enhancer.setCallback(this);
        //返回创建的代理类
        return  enhancer.create();
    }
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //创建切面类对象
        MyAspect myAspect = new MyAspect();
        //前置增强
        myAspect.check_permissions();
        //目标方法执行
        Object obj = methodProxy.invokeSuper(proxy,args);
       //后置增强
        myAspect.log();
        return obj;
    }
}
