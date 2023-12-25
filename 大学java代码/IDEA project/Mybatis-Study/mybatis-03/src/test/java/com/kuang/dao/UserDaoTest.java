package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {


    @Test
    public void test(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            //方式一: getMapper
              UserMapper userDao=sqlSession.getMapper(UserMapper.class);
             List<User> userList = userDao.getUserList();

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

    //select * from mybatis.user where id=#{id}
    //类型处理器
    //select id,name,pwd from mybatis.user where id =#{id}
//修改用户信息
    @Test
    public void updateuser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper =sqlSession.getMapper(UserMapper.class);
        mapper.updateById(new User(5,"小李","23455"));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteuser(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper =sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(2);
        sqlSession.commit();
        sqlSession.close();
    }

}
