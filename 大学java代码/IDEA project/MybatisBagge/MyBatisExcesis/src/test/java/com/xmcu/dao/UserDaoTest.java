package com.xmcu.dao;

import com.xmcu.pojo.User;
import com.xmcu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    //查询全部用户
    @Test
    public void getUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserMapper userMapper =sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserList();

            for(User user : userList){
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭sqlsession
            sqlSession.close();
        }
    }
//通过id查询用户
    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        User user=mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
//插入一个用户
    @Test
    public void insertUser(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserMapper userMapper =sqlSession.getMapper(UserMapper.class);
        int res = userMapper.addUser(new User(4,"张飞",36));
        if(res>0){
            System.out.println("插入成功！");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    //更新表单
@Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper =sqlSession.getMapper(UserMapper.class);
        userMapper.updateUser(new User(9,"jamess",33));
        sqlSession.commit();
        sqlSession.close();
}
//插入一个用户
@Test
public void deleteUser(){
    SqlSession sqlSession =MybatisUtils.getSqlSession();
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    userMapper.deleteUser(9);
    sqlSession.commit();
    sqlSession.close();
}
}
