package Test;

import com.xmcu.pojo.Student;
import com.xmcu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class StudentTest {
    @Test
    public void studentSessonfind() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        Student student = session.selectOne("findsById", 200250243);
        System.out.println(student);
        session.commit();
        session.close();
    }





    @Test
    public void updateStudent () throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");//将配置文件通过inputStream读入
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);//build方法将配置文件加载进来,构造会话工厂
        SqlSession session = sqlSessionFactory.openSession();//建立一个有会话工厂调用方法OpenSession()打开会话的Session
        Student student =new Student();
       student.setId(200250244);
       student.setName("陈怡婷");
       student.setAge(20);
        session.update("updateById",student);
        System.out.println(student);
        session.commit();//提交事务
        session.close();//关
    }
}
