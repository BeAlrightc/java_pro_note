package List;

import java.util.ArrayList;
import java.util.List;

import bean.Person;
import bean.Student;

public class Demo5_Generic {
	/*
	 * A：泛型通配符<?>
	 * 	任意类型，如果没有明确，那么就是Object以及任意的java类
	 * B：?extends E
	 * 向下限定，E及子类
	 * C:？super E
	 * 向上限定，E及其父类
	 */


	public static void main(String[] args) {
		//List<?>list = new ArrayList<Integer>();//当右边泛型不确定时，左边可以指定为?
	   ArrayList<Person> list1 = new ArrayList<>();
	   list1.add(new Person("张三",23));
	   list1.add(new Person("李四",24));
	   list1.add(new Person("王五",25));
	   
	   ArrayList<Student> list2 = new ArrayList<>();
	   list2.add(new Student("赵六",26));
	   list2.add(new Student("周七",27));
	   
	   list1.addAll(list2);//将list2加入到list1
	   System.out.println(list1);
	}

}
