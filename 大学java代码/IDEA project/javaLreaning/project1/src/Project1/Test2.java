package Project1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Test2 {
    /*
    在一个集合中存储了无序并且重复的字符串，定义一个方法。让其有序（字典顺序），而且还不能去除重复
    分析：
    1.定义list集合，并存储无序的字符串
    2.定义方法对其排序保留重复
    3.打印list集合
     */
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("ccc");
        list.add("ddd");
        list.add("ffffffff");
        list.add("heima");
        list.add("itcast");
        list.add("bbbb");
        list.add("aaa");
        list.add("aaa");
        //2.定义方法对其排序保留重复
        sort(list);
        // 3.打印list集合
        System.out.println(list);
    }
    /*
    定义方法并保留重复
    分析：
    1.创建Treeset集合对象。因为String本身就具备比较功能，但是重复不会保留，所以我们使用比较器
    2。将list集合中所有的元素添加到Treeset集合中，对其排序并保留重复
    3.清空list集合
    4.将Treeset集合中的排号的元素添加到list中

     */


    public static void sort(List<String> list){
      //  1.创建Treeset集合对象。因为String本身就具备比较功能，但是重复不会保留，所以我们使用比较器
        TreeSet<String> ts=new TreeSet<>(new Comparator<String>(){

            @Override
            public int compare(String s1, String s2) {
                //两个字符串进行比较 相同时num就为0
                int num =s1.compareTo(s2);//内容为主要条件
                //如果num是0那么就返回1，否则就返回带有其他数的num
                return num==0 ? 1:num;
            }
        });
        // 2。将list集合中所有的元素添加到Treeset集合中，对其排序并保留重复
        ts.addAll(list);
        //3.清空list集合
        list.clear();
        // 4.将Treeset集合中的排号的元素添加到list中
        list.addAll(ts);
    }
}

