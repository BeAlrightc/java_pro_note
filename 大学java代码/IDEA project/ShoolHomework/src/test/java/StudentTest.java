import com.liuChengChuan.pojo.Student;
import com.liuChengChuan.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTest {
    @Test
    public void FindA(){
        SqlSession session = MyBatisUtils.getSession();
        List<Student> list =session.selectList("com.liuChengChuan.mapper.StudentMapper.Theme1");
        for (Student student1 : list){
            System.out.println(student1);
        }
        session.close();
    }
    //小于5
    @Test
    public void FV5(){
        SqlSession session = MyBatisUtils.getSession();
        List<Student> list =session.selectList("com.xiaoqinyan.mapper.StudentMapper.lower5",5);
        for (Student student1 : list){
            System.out.println(student1);
        }
        session.close();
    }

    @Test
    public void Findmajor(){
        SqlSession session = MyBatisUtils.getSession();
        Student student = new Student();
       //student.setName("李四");
       //student.setMajor("语文");
        List<Student> list =session.selectList("com.liuChengChuan.mapper.StudentMapper.Theme2",student);
        for (Student student1 : list){
            System.out.println(student1);
        }
        session.close();
    }
    @Test
    public void SelctFind(){
        SqlSession session = MyBatisUtils.getSession();
        Student student  =new Student();
        //student.setName("张三");
       // student.setId(3);
        List<Student> list = session.selectList("com.liuChengChuan.mapper.StudentMapper.selectByList",student);
        for(Student student2 : list){
            System.out.println(student2);
        }
        session.close();
    }

    @Test
    public void findd(){
        SqlSession session = MyBatisUtils.getSession();
        List<Integer> ids =new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        //student.setName("张三");
        // student.setId(3);
        List<Student> list = session.selectList("com.liuChengChuan.mapper.StudentMapper.SelecByLists",ids);
        for(Student student2 : list){
            System.out.println(student2);
        }
        session.close();
    }
    @Test
    public void findE(){
        SqlSession session = MyBatisUtils.getSession();
        int Array[] = {1,2,3,4,5};
        List<Student> stu = session.selectList("com.liuChengChuan.mapper.StudentMapper.SelectByArrays",Array);
        for (Student stu1:
             stu) {
            System.out.println(stu1);
        }

    }
@Test
    public void mapf(){
        SqlSession session = MyBatisUtils.getSession();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
    Map<String,Object> mapsh = new HashMap<String, Object>();
    mapsh.put("id",ids);
    mapsh.put("major","数学");
    List<Student> stu = session.selectList("com.liuChengChuan.mapper.StudentMapper.SelectByMap",mapsh);
    for (Student stu2:stu
         ) {
        System.out.println(stu2);
        session.close();
    }

}
@Test
    public void insert(){
        SqlSession session = MyBatisUtils.getSession();
        Student stu = new Student();
        stu.setName("小新");
        stu.setMajor("大数据");
        stu.setSno("12343");
        session.insert("com.liuChengChuan.mapper.StudentMapper.InsertsTU",stu);
        session.commit();
        session.close();
   }

    @Test
    public void update1(){
        SqlSession session = MyBatisUtils.getSession();
        Student stu = new Student();
        stu.setId(2);
       stu.setName("胡歌");
       // stu.setMajor("云计算应用");
        session.update("com.liuChengChuan.mapper.StudentMapper.update2", stu);
        session.commit();
        session.close();
    }

}
