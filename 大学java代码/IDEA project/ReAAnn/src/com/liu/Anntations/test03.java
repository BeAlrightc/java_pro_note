package com.liu.Anntations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class test03 {
    //注解可以赋值，如果没有默认值，我们就必须赋给默认值
    @MyAnnots(age=18)
    public void test(){

    }
    @Myanno3("da")
    public void test2(){

    }

}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnots{
    //注解的参数
String name() default "";//有默认值可以不写
int age();
int id() default -1;//默认值为-1代表不存在
String[] schools() default {"清华大学","厦门大学"};
}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Myanno3{
String value();//只有一个值就用value()只有value才可省略
}
