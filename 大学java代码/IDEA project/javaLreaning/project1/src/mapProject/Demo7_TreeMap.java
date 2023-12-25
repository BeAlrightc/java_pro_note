package mapProject;

import bean.Student;
import bean.Students;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo7_TreeMap {
    /*
    创建一个双列集合
    TreeMap集合键是Student值String的案例
    实现按照姓名或者年龄进行排序操作
     */
    public static void main(String[] args) {
//        demo1();
        //通过创建Comparator匿名内部类的方式进行姓名排序
        TreeMap<Students,String> tm=new TreeMap<>(new Comparator<Students>(){

            @Override
            public int compare(Students o1, Students o2) {
                int num=o1.getName().compareTo(o2.getName());
                return num==0 ? o1.getAge()-o2.getAge() : num;
            }
        });
        tm.put(new Students("张三",23),"北京");
        tm.put(new Students("李四",24),"上海");
        tm.put(new Students("王五",27),"广州");
        tm.put(new Students("赵六",21),"深圳");
        System.out.println(tm);

    }

    private static void demo1() {
        TreeMap<Students,String> tm=new TreeMap<>();
        tm.put(new Students("张三",23),"北京");
        tm.put(new Students("李四",24),"上海");
        tm.put(new Students("王五",27),"广州");
        tm.put(new Students("赵六",21),"深圳");
        System.out.println(tm);
    }
}
