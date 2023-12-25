package Project1;

import bean.Person;

import java.util.Comparator;
import java.util.TreeSet;

public class Test1 {
    /*
    TreeSet集合是用来对元素进行排序操作，斌且可以保证元素唯一性
    当compareto方法返回0时，只有一个元素；
    当compareto方法返回正数时，集合怎么存就怎么取
    当compareto方法返回负数时，集合按照倒序的方法输出

    TreeSet底层原理:
    二叉树的两个叉
    小的存储在左边（负数），大的存储在右边（正数），相等的话就不存在(0)
    compareTo方法中在TreeSet集合如何存储元素取决于compareTo的返回值

    1,返回0，集合中只有一个元素
    2，返回-1，集合会将存储的元素倒序输出
    3.返回1，集合会将存储的元素正序输出（集合怎么存就怎么取）
     */

    public static void main(String[] args) {
//        demo1();
     //   demo2();
//        demo3();
//        demo4();
        //需求:将字符串按照长度排序
        TreeSet<String> ts= new TreeSet<>(new compareByLen());
        ts.add("aaa");
        ts.add("z");
        ts.add("wc");
        ts.add("nba");
        ts.add("cba");
        System.out.println(ts);
    }

    private static void demo4() {
        TreeSet<Person> ts= new TreeSet<>();
        ts.add(new Person("zhangsan",23));
        ts.add(new Person("lisi",13));
        ts.add(new Person("wangwu",33));
        ts.add(new Person("zhaoliu",43));
        ts.add(new Person("aaaa",53));
        System.out.println(ts);
    }

    private static void demo3() {
        TreeSet<Person> ts= new TreeSet<>();
        ts.add(new Person("张三",23));
        ts.add(new Person("李四",13));
        ts.add(new Person("-王五",43));
        ts.add(new Person("赵六",33));
        //打印出除文字码表值
        System.out.println('张' + 0);
        System.out.println('王' + 0);
        System.out.println('赵' + 0);
        System.out.println(ts);
    }

    private static void demo2() {
        TreeSet<Person> ts= new TreeSet<>();
        ts.add(new Person("张三",23));
        ts.add(new Person("李四",54));
        ts.add(new Person("王五",25));
        ts.add(new Person("赵六",37));
        ts.add(new Person("老七",37));
        System.out.println(ts);
    }

    private static void demo1() {
        TreeSet<Integer> ts =new TreeSet<Integer>();
        ts.add(1);
        ts.add(1);
        ts.add(2);
        ts.add(2);
        ts.add(3);
        ts.add(3);
        System.out.println(ts);
    }
    static class compareByLen implements Comparator<String>{

        @Override
        public int compare(String s1, String s2) {//按照字符串的长度进行比较
          int num =s1.length()-s2.length();//长度为主要条件，内容为次要条件
            return num==0 ? s1.compareTo(s2):num;
        }
    }
}
