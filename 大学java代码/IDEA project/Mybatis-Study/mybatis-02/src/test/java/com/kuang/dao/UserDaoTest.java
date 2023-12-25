package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
      List<User> userList =  mapper.getUserLike("%狂%");
      for(User user : userList){
          System.out.println(user);
      }
        sqlSession.close();
    }

    @Test
    public void test(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            //方式一: getMapper
              UserMapper userDao=sqlSession.getMapper(UserMapper.class);
             List<User> userList = userDao.getUserList();
            //方式二：不推荐使用
           // List<User> userList= sqlSession.selectList("com.kuang.dao.UserMapper.getUserList");

            for(User user : userList){
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        //关闭SqlSession
        sqlSession.close();
        }
    }
@Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        User user=mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    

    //增删改需要提交事务!!!
    @Test
    public void insertUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
       int res = mapper.addUser(new User(4,"小风","12345"));
        if(res>0){
            System.out.println("插入成功！");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(4,"小里","6713213"));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void dateteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
       int res = mapper.deleteUser(4);
      if(res>0){
          System.out.println("删除成功");
      }else{
          System.out.println("删除失败");
      }
        sqlSession.commit();
        sqlSession.close();
    }

}
