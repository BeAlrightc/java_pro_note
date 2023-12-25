package Test;

import com.xmcu.pojo.Customer;
import com.xmcu.pojo.Student;
import com.xmcu.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class MyBatisTest {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    @Before
    public void init() {
        //定义读取文件名
        String resources = "mybatis-config.xml";
        //创建流
        Reader reader = null;
        try {
            //读取mybatis-config.xml文件到reader对象中
            reader = Resources.getResourceAsReader(resources);
            //初始化mybatis,创建SqlSessionFactory类的对象
            SqlSessionFactory sqlMapper = new
                    SqlSessionFactoryBuilder().build(reader);
            //创建session对象
            sqlSession = sqlMapper.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findAllStudentTest() {
        // SqlSession执行映射文件中定义的SQL，并返回映射结果
        List<Student> list =
                sqlSession.selectList("com.xmcu.mapper.StudentMapper." +
                        "findAllStudent");
        for (Student student : list) {
            System.out.println(student);
        }
    }

    /**
     * 根据客户姓名和职业组合条件查询客户信息列表
     */
    @Test
    public void findCustomerByNameAndJobsTest() {
        // 通过工具类获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        // 创建Customer对象，封装需要组合查询的条件
        Customer customer = new Customer();
        customer.setUsername("jack");
        customer.setJobs("teacher");
        // 执行SqlSession的查询方法，返回结果集
        List<Customer> customers = session.selectList("com.xmcu.mapper"
                + ".CustomerMapper.findCustomerByNameAndJobs", customer);
        // 输出查询结果信息
        for (Customer customer2 : customers) {
            // 打印输出结果
            System.out.println(customer2);
        }
        // 关闭SqlSession
        session.close();
    }

    /**
     * 根据客户姓名或职业查询客户信息列表
     */
    @Test
    public void findCustomerByNameOrJobsTest() {
        // 通过工具类获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        // 创建Customer对象，封装需要组合查询的条件
        Customer customer = new Customer();
//        customer.setUsername("tom");
//        customer.setJobs("teacher");
        // 执行SqlSession的查询方法，返回结果集
        List<Customer> customers = session.selectList("com.xmcu.mapper"
                + ".CustomerMapper.findCustomerByNameOrJobs", customer);
        // 输出查询结果信息
        for (Customer customer2 : customers) {
            // 打印输出结果
            System.out.println(customer2);
        }
        // 关闭SqlSession
        session.close();
    }

    @After
    public void destory() {
        //提交事务
        sqlSession.commit();
        //关闭事务
        sqlSession.close();
    }
}

