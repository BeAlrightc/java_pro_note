package Test;

import com.xmcu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class UserTest {
    //采用reader形式来读取配置文件
    @Test
    public void userFindByIdTest() {
        String resources = "mybatis-config.xml";

        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);//构造会话工厂

        SqlSession session = sqlMapper.openSession();

        User user = session.selectOne("findbyId", 2);
        System.out.println(user);
        session.close();
    }
//采用inputStream读取配置文件
    @Test
    public void userSessonfind() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");//将配置文件通过inputStream读入
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);//build方法将配置文件加载进来,构造会话工厂
        SqlSession session = sqlSessionFactory.openSession();//建立一个有会话工厂调用方法OpenSession()打开会话的Session

        //User user = session.selectOne("findById", 1);//执行Sql语句
        //System.out.println(user);
        session.update("updatebook",new User(4,"詹姆斯",45));//加载Mapper.xml映射文件执行动态SQL语句
        session.commit();//提交事务
        session.close();//关闭会话
    }
}
