import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.xmcu.dao.IClassMapper;
import com.xmcu.dao.IStudentMapper;
import com.xmcu.pojo.IClass;
import com.xmcu.pojo.IStudent;
import com.xmcu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyBatisTest2 {
   @Test
    public void findStudentByIdIs2Test(){
       SqlSession session =MyBatisUtils.getSession();
       IStudentMapper mapper = session.getMapper(IStudentMapper.class);
       IStudent student = mapper.selectStudent(2);
       System.out.println(student.toString());
       session.close();
   }
   @Test
    public void updateIStudent(){
       SqlSession session= MyBatisUtils.getSession();
       IStudent student = new IStudent();
       student.setId(4);
       student.setName("李雷");
       student.setAge(21);
       IStudentMapper mapper= session.getMapper(IStudentMapper.class);
       int result =mapper.updateStudent(student);//更新学生信息
       if(result>0){
           System.out.println("成功更新"+result+"条数据");
       }else{
           System.out.println("更新数据失败");
       }
       System.out.println(student.toString());
       session.commit();
       session.close();
   }
//一对多的查询
   @Test
    public void selectStudentBycID(){
       SqlSession session= MyBatisUtils.getSession();
       IStudentMapper mapper= session.getMapper(IStudentMapper.class);
      List<IStudent> list = mapper.selectStudentByCid(1);
       for (IStudent student:
            list) {
           System.out.println(student.toString());
       }
   }

   //多对多
    @Test
    public void selectClassByIdTest(){
       SqlSession session = MyBatisUtils.getSession();
        IClassMapper mapper = session.getMapper(IClassMapper.class);
        IClass iClass = mapper.selectClassById(2);
        System.out.println(iClass.toString());
        session.close();
    }

}
