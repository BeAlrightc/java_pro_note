package com.liu.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获得类的信息
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.liu.Reflections.User");

//     User user=new User();
//     c1=user.getClass();

        //获取类的名字
        System.out.println(c1.getName());//获得包名+类名
        System.out.println(c1.getSimpleName());//获得类名

        //获得类的属性
        System.out.println("==========");
        Field[] fields = c1.getFields();//只能找到public属性
//        for(Field field : fields){
//            System.out.println(field);
//        }
        fields = c1.getDeclaredFields();//强制打印
        for (Field field : fields) {
            System.out.println(field);
        }

        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        //获得类的方法
        System.out.println("==========");
        Method[] methods = c1.getMethods();

        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("=====");
        methods = c1.getDeclaredMethods();//可以获得全部方法也包括私有方法
        for (Method method : methods) {
            System.out.println(method);
        }
//获得指定的方法
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);


        //获得指定的构造器
        System.out.println("====================conss");

    Constructor[] cons=c1.getConstructors();
    for(Constructor constructor : cons){
       System.out.println(constructor) ;
    }
    System.out.println("================c");
        cons=c1.getDeclaredConstructors();
        for(Constructor constructor : cons){
            System.out.println(constructor) ;
        }
        //获取指定构造器
    Constructor deeclaredConstructor=c1.getDeclaredConstructor(String.class,int.class,int.class);
        System.out.println("指定："+deeclaredConstructor);//打印构造器
    }
}
