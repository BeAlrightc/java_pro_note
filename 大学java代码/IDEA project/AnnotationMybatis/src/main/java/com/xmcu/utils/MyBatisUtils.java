package com.xmcu.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory =null;
    //初始化SqlSessionFactory对象
    static {
        try {
            Reader reader=
                    Resources.getResourceAsReader("mybatis-config.xml");
            //构建SqlSessionFactory
            sqlSessionFactory=
                    new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //获取SqlSession对象的静态方法
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}
