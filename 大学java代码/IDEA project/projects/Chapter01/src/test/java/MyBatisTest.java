
import com.xpp.pojo.*;

import com.xpp.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public void findByIdTest() {
        // 通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        Employee employee =
                session.selectOne("com.xpp.mapper.EmployeeMapper.findById", 1);
        System.out.println(employee);
        session.commit();
        // 关闭SqlSession
        session.close();
    }

    @Test
    public void insertEmployeeTest() {
        // 通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        Employee employee = new Employee();
        employee.setId(4);
        employee.setName("赵六");
        employee.setAge(55);
        employee.setPosition("总裁");
        int result =
                session.insert("com.xpp.mapper.EmployeeMapper.addEmployee", employee);
        if (result > 0) {
            System.out.println("成功插入" + result + "条数据");
        } else {
            System.out.println("插入数据失败");
        }
        System.out.println(employee.toString());
        session.commit();
        // 关闭SqlSession
        session.close();
    }

    @Test
    public void updateEmployeeTest() {
        // 通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        Employee employee = new Employee();
        employee.setId(2);
        employee.setName("小四");
        employee.setAge(23);
        employee.setPosition("经理");
        int result =
                session.update("com.xpp.mapper.EmployeeMapper.updateEmployee",
                        employee);
        if (result > 0) {
            System.out.println("成功更新" + result + "条数据");
        } else {
            System.out.println("更新数据失败");
        }
        System.out.println(employee.toString());
        session.commit();
        // 关闭SqlSession
        session.close();
    }

    @Test
    public void deleteEmployeeTest() {
        // 通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        int result =
                session.delete("com.xpp.mapper.EmployeeMapper.deleteEmployee", 4);
        if (result > 0) {
            System.out.println("成功删除" + result + "条数据");
        } else {
            System.out.println("删除数据失败");
        }
        session.commit();
        // 关闭SqlSession
        session.close();
    }

    @Test
    public void findStudenByNameOrMajorTest() {
        SqlSession session = MyBatisUtils.getSession();
        Studen studen=new Studen();
        studen.setName("张三");
        studen.setMajor("英语");
        List < Studen > studens = session.selectList("com.xpp.mapper"
                + ".StudenMapper.findStudenByNameAndMajor", studen);
        for (Studen studen2 : studens) {
            System.out.println(studen2);
        }
        session.close();
    }





}



