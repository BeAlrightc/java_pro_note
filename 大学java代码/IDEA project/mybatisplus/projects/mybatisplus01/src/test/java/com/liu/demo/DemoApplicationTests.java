package com.liu.demo;

import com.liu.demo.mapper.UserMapper;
import com.liu.demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
//继承了BaseMapper的所有的方法都来自父类。
    @Autowired(required = false)
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        //参数是wrapper条件构造器
        //查询全部用户
        List<User> users = userMapper.selectList(null);
        //遍历集合操作
        users.forEach(System.out::println);

    }
    //测试插入功能
   @Test
    public void TestInsert(){
      User user = new User();
      user.setName("狂神说java");
      user.setAge(3);
      user.setEmail("11317777549@qq.com");
      user.setId(7);

       int result =userMapper.insert(user);//帮我们自动生成id

        System.out.println(result);//受影响的行数
        System.out.println(user);//发现id会自动回填
    }
    //修改数据
    @Test
    public void TestAlter(){
        User user=new User();
        user.setName("狂神说java");
        user.setAge(3);
        user.setEmail("11317777549@qq.com");
        user.setId(7);
        int result =userMapper.updateById(user);

    }
    @Test
    public void deleteUser(){
       // int result = userMapper.deleteById(2);//不可这样使用这个删除方法
    }
}
