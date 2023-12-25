package employee;

import com.xmcu.pojo.Employee;
import com.xmcu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void findByIdTest(){
        SqlSession session = MyBatisUtils.getSession();
        Employee employee = session.selectOne("findById",1);
        System.out.println(employee);
        session.commit();
        session.close();
    }
    @Test
    public void FindAll() {
        SqlSession session = MyBatisUtils.getSession();
        List<Employee> list = session.selectList("findAll");
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
        @Test
    public void updateById() {
            SqlSession session = MyBatisUtils.getSession();
             int res=session.update("UpdateById",new Employee(1,"李四",21,"员工"));
             if(res >0){
                 System.out.println("成功修改");
             }else{
                 System.out.println("修改失败");
             }
             session.commit();
             session.close();
        }
        @Test
    public void addEmployee(){
        SqlSession session = MyBatisUtils.getSession();
        int res =session.insert( "AddEmloyee",new Employee(6,"赵六",23,"经理"));
            if(res >0){
                System.out.println("成功添加");
            }else{
                System.out.println("添加成功");
            }
            session.commit();
            session.close();
        }
        @Test
    public void deleteEmployee(){
        SqlSession session = MyBatisUtils.getSession();
        int res =session.delete("deleteEmployee",6);
            if(res >0){
                System.out.println("成功删除");
            }else{
                System.out.println("删除失败");
            }
            session.commit();
            session.close();
        }

}
