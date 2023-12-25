package Reflection.Poxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHadler implements InvocationHandler {
    private Object target;

    public MyInvocationHadler(Object target) {//为了接收被代理的对象
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("权限校验");
        method.invoke(target, args);//执行被代理Target对象的方法,并在执行之前和执行之后加上相应的方法
        System.out.println("日志记录");
        return null;
    }
}
