import com.xmcu.dao.OrdersMapper;
import com.xmcu.dao.PersonMapper;
import com.xmcu.dao.UsersMapper;
import com.xmcu.dao.WorkerMapper;
import com.xmcu.pojo.Orders;
import com.xmcu.pojo.Person;
import com.xmcu.pojo.Users;
import com.xmcu.pojo.Worker;
import com.xmcu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyBatisTest {
    @Test
    public void SelectAll(){

    }

    @Test
    public void findWorkerByIdTest(){
        SqlSession session= MyBatisUtils.getSession();
        WorkerMapper mapper = session.getMapper(WorkerMapper.class);
        Worker worker =mapper.selectWorker(2);
        System.out.println(worker.toString());
        session.close();
    }
    @Test
    public void insertWorkerTest(){
        SqlSession session=MyBatisUtils.getSession();
        Worker worker = new Worker();
        //worker.setId(3);
        worker.setName("王八");
        worker.setAge(36);
        worker.setSex("女");
        worker.setWorker_id("1006");
        WorkerMapper mapper  =session.getMapper(WorkerMapper.class);
        int result = mapper.insertWorker(worker);
        session.commit();
        session.close();
    }

    @Test
    public void updateWorkerTest(){
        SqlSession session = MyBatisUtils.getSession();
        Worker worker = new Worker();
        worker.setId(3);
        worker.setName("王五");
        worker.setAge(29);
        worker.setSex("女");
        worker.setWorker_id("1003");
        WorkerMapper mapper = session.getMapper(WorkerMapper.class);
        int result = mapper.updateWorker(worker);
       if(result >0){
           System.out.println("更新成功");
           System.out.println(worker.toString());
       }else{
           System.out.println("更新失败");
       }
        session.commit();
        session.close();
    }
    @Test
    public void deleteWorkerTest(){
        SqlSession session = MyBatisUtils.getSession();
        WorkerMapper mapper=session.getMapper(WorkerMapper.class);
        int result = mapper.deleteWorker(4);
        if(result >0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        session.commit();
        session.close();
    }
//使用param进行注入参数，用id和name进行查询
    @Test
    public void selectWorkerAndNameTest(){
        SqlSession session = MyBatisUtils.getSession();
        WorkerMapper mapper = session.getMapper(WorkerMapper.class);
        Worker worker =mapper.selectWorkerByIdAndName(3,"王五");
        System.out.println(worker.toString());
        session.close();

    }

//一对一查询
    @Test
    public void selectPersonByidTest(){
        SqlSession session = MyBatisUtils.getSession();
        PersonMapper mapper = session.getMapper(PersonMapper.class);
        Person person = mapper.selectPersonById(2);
        System.out.println(person.toString());
        session.close();
    }
    //一对多查询
    @Test
    public void selectUserByIdTest(){
        SqlSession session = MyBatisUtils.getSession();
        UsersMapper mapper=session.getMapper(UsersMapper.class);
        Users users=mapper.selectUserById(1);
        System.out.println(users.toString());
        session.close();
    }
//多对多查询
    @Test
    public void selectOrdersByIdTest(){
        SqlSession session=MyBatisUtils.getSession();
        OrdersMapper mapper = session.getMapper(OrdersMapper.class);
        Orders orders= mapper.selectOrdersById(1);
        System.out.println(orders.toString());
        session.close();
    }


}
