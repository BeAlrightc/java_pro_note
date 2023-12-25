package com.liu.Anntations;

import java.lang.annotation.*;

//测试元注解
public class test02 {

    @Myanno
    public void test(){

    }
}

//定义一个注解
//Targert表示注解作用在什么地方
@Target(value= {ElementType.METHOD,ElementType.TYPE})//定义注解作用域
//@rETENTION表示我们的注解在什么时候有效 runtime>class>source
@Retention(value= RetentionPolicy.RUNTIME)

//Documented表示是否将我们的注解生成在JAVAdoc中
@Documented
//Inherited子类可以继承父类的注解
@Inherited
@interface Myanno{

}
