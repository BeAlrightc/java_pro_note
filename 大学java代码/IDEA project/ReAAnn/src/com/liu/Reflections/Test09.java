package com.liu.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//动态的创建对象
public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获得class对象
        Class c1 = Class.forName("com.liu.Reflections.User");

        //构造一个对象
//        User user=(User)c1.newInstance();//本质上是调用类的无参构造器
//        System.out.println(user);
       //通过构造器创建对象
//      Constructor constructor = c1.getDeclaredConstructor(String.class,int.class,int.class);
//      User user2= (User) constructor.newInstance("刘承传",001,18);
//      System.out.println(user2);

      //通过反射调用方法
        User user3= (User)c1.newInstance();//创建一个实例对象
        //通过对象调用方法
        user3.setName("小明");
        System.out.println(user3.getName());
        //通过反射获取一个方法
      Method setName=  c1.getDeclaredMethod("setName",String.class);
      //invoke:激活的意思
        //（对象，”方法的值“）
      setName.invoke(user3,"小李");//激活方法
        System.out.println(user3.getName());
//通过反射操作属性
        User user4= (User)c1.newInstance();
       Field name= c1.getDeclaredField("name");
       //不能操作私有属性，开启访问权限，取消安全检测setAccessible(true);
       name.setAccessible(true);
       name.set(user4,"小李2");
      System.out.println(user4.getName());
    }
}
