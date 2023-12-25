import com.liuChengChuan.pojo.Orders;
import com.liuChengChuan.pojo.Person;
import com.liuChengChuan.pojo.Users;
import com.liuChengChuan.utils.MyBatisUtils;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class MyBatisTest {
    //一对一查询
    @Test
    public void findById() {
        SqlSession session = MyBatisUtils.getSession();
        Person person = session.selectOne("com.liuChengChuan.mapper.PersonMapper.findPersonById", 1);
        System.out.println(person);
        session.close();
    }
    //一对一查询
    @Test
    public void findPersonByIdTest2(){
        SqlSession session = MyBatisUtils.getSession();
        Person person =
                session.selectOne("com.liuChengChuan.mapper.PersonMapper.findPersonById2",2);
        System.out.println(person);
        session.close();
    }
    //一对多查询
    @Test
    public void findUserTest(){
        SqlSession session = MyBatisUtils.getSession();
        Users users = session.selectOne("com.liuChengChuan.mapper.UsersMapper.findUserWithOrders",1);
        System.out.println(users);
        session.close();
    }
    //多对多查询
    @Test
    public void findOrdersTest(){
        SqlSession session = MyBatisUtils.getSession();
        Orders orders =session.selectOne("com.liuChengChuan.mapper.OrdersMapper.findOrdersWithProduct",1);
        System.out.println(orders);
        session.close();
    }
}
