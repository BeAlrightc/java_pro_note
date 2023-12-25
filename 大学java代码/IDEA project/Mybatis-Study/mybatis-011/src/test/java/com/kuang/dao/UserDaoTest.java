package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    //查询所有用户操作
    @Test
    public void SelectUserT(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> UserList =mapper.getUserList();
            for(User user: UserList){
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    //根据ID查询用户操作
    @Test
    public void SelectById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
         User user = mapper.SelectById(1);
        System.out.println(user);
        sqlSession.close();
    }
    //插入一个新用户
    @Test
    public void InsertUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.InsertUser(new User(4,"嚣张","12345"));
        System.out.println("插入成功");
        //提交事务
        sqlSession.commit();
        //关闭Sqlsession
        sqlSession.close();
    }
    @Test
    public void UpdateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper =sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(4,"晓明","123123"));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void Delete(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper =sqlSession.getMapper(UserMapper.class);
        System.out.println("OK ");
        mapper.deleteUser(4);
        sqlSession.commit();
        sqlSession.close();
    }

}
