package com.xmcu.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//利用工具类将那些资源加载进来
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static{
        try {
            //使用mybatis第一步：获取sqlsessionFactory对象
            String resource ="mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //既然有了SqlSessionFactory，顾名思义我们就可以从中获得SqlSession的实例了
    //SqlSession完全包含了面向数据库执行SQL命令所需的所有方法
    public static SqlSession getSqlSession(){
        return  sqlSessionFactory.openSession();

    }
}
