import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    //用注解实现用mybatis实现对数据库的增删改查工作
    //输出所有用户
    @Test
    public void test(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        //底层主要应用反射
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for(User user : users){
            System.out.println(user);
        }
        sqlSession.close();
    }
    //根据ID查用户
    @Test
    public void test2(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User userById=mapper.getUserById(1);
        System.out.println("userById");
        sqlSession.close();
    }
    //添加一个用户
    @Test
    public void addUser(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.adduser(new User(5,"hello","123"));
        sqlSession.close();
    }
    //修改用户
    @Test
    public void update(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(5,"to","000"));
        sqlSession.close();
    }
    //删除用户
    @Test
    public void delete(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(5);
        sqlSession.close();
    }
}
