package com.atguigu.spring5.collectiontype.factorybean;

import com.atguigu.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean <Course>{

    //返回实例
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course ;
    }
//返回类型
    public Class<?> getObjectType() {
        return null;
    }
//判断是否为单例
    public boolean isSingleton() {
        return false;
    }
}
