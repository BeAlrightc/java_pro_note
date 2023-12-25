package com.xmcu.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler {
    //声明目标类接口
    private UserDao userDao;
    //创建代理方法
    public Object createProxy(UserDao userDao) {
        this.userDao = userDao;
        //类加载器
        ClassLoader classLoader = MyProxy.class.getClassLoader();
        //2.被代理对象实现所有接口
        Class[] classes = userDao.getClass().getInterfaces();
        //使用代理类，进行增强，返回的是代理对象
        return Proxy.newProxyInstance(classLoader,classes,this);
    }
    /*
    所有动态代理类的方法调用，都会交由invoke()方法进行处理
    proxy：被代理的对象
    method:将要被执行的方法信息(反射)
    args:执行方法时需要的参数
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //创建切面对象
        MyAspect myAspect = new MyAspect();
        //前置增强类
        myAspect.check_permissions();
        //在目标类上调用方法，并传入参数
        Object obj = method.invoke(userDao,args);
        //后置增强类
        myAspect.log();
        return obj;
    }
}
