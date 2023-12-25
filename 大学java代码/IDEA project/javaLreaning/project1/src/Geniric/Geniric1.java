package Geniric;

import bean.BaseStudent;
import bean.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Geniric1 {
    /*
      泛型固定下边界
      ?super E
      泛型固定上边界
      ?extends E
     */
    public static void main(String[] args) {
//        demo1();
        TreeSet<Students> ts1=new TreeSet<>(new CompareByage());
        ts1.add(new Students("张三",33));
        ts1.add(new Students("李四",13));
        ts1.add(new Students("王五",23));
        ts1.add(new Students("赵六",43));
        System.out.println(ts1);
        TreeSet<BaseStudent> ts2=new TreeSet<>(new CompareByage());
        ts2.add(new BaseStudent("张三",33));
        ts2.add(new BaseStudent("李四",13));
        ts2.add(new BaseStudent("王五",23));
        ts2.add(new BaseStudent("赵六",43));
        System.out.println(ts2);
    }


    private static void demo1() {
        ArrayList<Students> list1 =new ArrayList<>();
        list1.add(new Students("张三",23));
        list1.add(new Students("李四",24));

        ArrayList<BaseStudent> list2 =new ArrayList<>();
        list2.add(new BaseStudent("王五",25));
        list2.add(new BaseStudent("赵六",26));

        list1.addAll(list2);
    }
}
class CompareByage implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        int num =o1.getAge() -o2.getAge();
        return num==0 ? o1.getName().compareTo(o2.getName()) : num;
    }
}
