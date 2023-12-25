package com.liu.Reflections;

import java.lang.annotation.ElementType;

public class Reflection03 {
    public static void main(String[] args) {
        Class c1=Object.class;//类
        Class c2=Comparable.class;//接口
        Class c3=String[].class;//数组
        Class c4=int[][].class;//二维数组
        Class c5=Override.class;//注解
        Class c6= ElementType.class;//枚举
        Class c7 =Integer.class;//基本数据类型
        Class c8=void.class;//void
        Class c9=Class.class;//Class


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
//只要元素与维度一样，就是同一个class对象
        int[] a=new int[10];
        int[] b=new int[10];
        //无论数组的长度是多少，他们的class对象都是一样的
        System.out.println(a.getClass().hashCode()+"  "+b.getClass().hashCode());
    }
}
