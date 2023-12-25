package Reflection.reflect;

import Reflection.beans.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

//利用反射获取类的成员变量
/*
Class.getFiled(String)方法可以获取类中的指定字段（可见的）
如果是私有的可以用getDeclaedFiled("name")方法获取，通过set(obj,"李四")方法可以设置指定对象上该字段的值，
如果是私有的需要调用setAccessible(true)设置访问权限，用获取的指定的字段get(obj)可以获取指定对象中该字段
 */
public class Demo4_reflect {
    public static void main(String[] args) throws Exception {
        Class clazz =Class.forName("Reflection.beans.Person");
        Constructor c=clazz.getConstructor(String.class,int.class);//获取有参构造
        Person p = (Person) c.newInstance("张三",23);//使用有参构造创建一个对象

       // Field f=clazz.getField("name");
       // f.set(p,"李四");//修改姓名的值

        Field f=clazz.getDeclaredField("name");   //暴力反射获取字段
        f.setAccessible(true);//去除私有权限
        f.set(p,"李四");
        System.out.println(p);//成功修改值

    }
}
