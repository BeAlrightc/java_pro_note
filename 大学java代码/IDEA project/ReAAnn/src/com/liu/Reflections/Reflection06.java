package com.liu.Reflections;

public class Reflection06 {
    static {
        System.out.println("main类被加载");
    }
    public static void main(String[] args) throws ClassNotFoundException {
//1.主动引用
      //  Son son =new Son();

//2.反射也会产生主动引用
//  Class c1=Class.forName("com.liu.Reflections.Son");

  //不会产生类的引用方法
        //System.out.println(Son.b);//子类不会被加载
        //Son[] array =new Son[5];
        System.out.println(Son.M);
    }
}

class Father{

    static int b=2;

    static{
        System.out.println("父类被加载");
    }
}

class Son extends Father{
   static {
       System.out.println("子类被加载");
       m=300;
   }
   static int m=100;
   static final int M=1;
}
