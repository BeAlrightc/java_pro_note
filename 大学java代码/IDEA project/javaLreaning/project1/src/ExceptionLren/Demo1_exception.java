package ExceptionLren;
/*
A.异常的概述：
    异常就是java程序在运行时出现的错误
B.异常的分类
   通过API查看Throwable
C.异常的继承体系
 Throwable
     Error
     Exception
       runtimeException(运行时异常，程序员犯的错误)
 */

public class Demo1_exception {
    public static void main(String[] args) {
     int[] arr={11,22,33,44,55};
        // arr=null;
        System.out.println(arr[4]);
    }
}
