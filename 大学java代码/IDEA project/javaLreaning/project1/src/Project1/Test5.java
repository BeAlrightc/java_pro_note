package Project1;

import bean.Student;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
  案例演示;
  需求：键盘录入5个学生信息（姓名，语文成绩，数学成绩，英语成绩），按照总分从高到低输出到控制台
  分析：
  1.定义一个学生类
  成员变量：姓名，语文成绩，数学成绩，英语成绩，总成绩
  成员方法：空参，有参构造。并且有参构造的参数为：姓名，语文成绩，数学成绩，英语成绩
  toString()方法，在遍历集合中的Student对象在打印对象的引用的时候会打印显示属性值
  2.键盘录入，创建Scanner对象
  3.创建TreeSet集合对象，在TreeSet的构造函数中传入比较器，按照总分进行比较。
  4.录入五个学生，集合中的学生个数为判断条件如果size小于5就进行存储，大于5就跳出
  5.将录入的字符串切割，会返回一个字符串数组，将字符串数组中的第二个元素转换成int数组
  6.当转换后的结构封装为Student对象，将Student对象添加到TreeSet集合当中
  7.遍历TreeSet集合打印每一个Student对象
 */
public class Test5 {
    public static void main(String[] args) {
        // 2.键盘录入，创建Scanner对象
     Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生格式为：姓名，语文成绩，数学成绩，英语成绩，总成绩");
  //3.创建TreeSet集合对象，在TreeSet的构造函数中传入比较器，按照总分进行比较。
        TreeSet<Student> ts =new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //倒序输出
                int num=s2.getSum()-s1.getSum();
                //如果num==0就返回1，否则返回num值
                return num==0 ? 1:num;
            }

        });
        //4.录入五个学生，集合中的学生个数为判断条件如果size小于5就进行存储，大于5就跳出
        while(ts.size()<5){
        // 5.将录入的字符串切割，会返回一个字符串数组，将字符串数组中的第二个元素开始转换成int数组
            String line= scanner.nextLine();
            //切割字符串
            String[] arr =line.split(",");
            //将字符串数组中的第二个元素开始转换成int数组
            int chinese=Integer.parseInt(arr[1]);
            int math=Integer.parseInt(arr[2]);
            int english=Integer.parseInt(arr[3]);
            //6.当转换后的结构封装为Student对象，将Student对象添加到TreeSet集合当中
            ts.add(new Student(arr[0],chinese,math,english));

        }
        // 7.遍历TreeSet集合打印每一个Student对象
        System.out.println("排序后的学生信息");
        //将TreeSet里面的元素逐个打印出来
        for (Student s:ts) {
            System.out.println(s);
        }
    }

}
