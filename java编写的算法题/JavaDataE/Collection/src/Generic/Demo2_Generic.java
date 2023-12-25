package Generic;

import java.util.ArrayList;
import java.util.Iterator;

import bean.Person;

public class Demo2_Generic {
	/*
	 * A：案例演示
	 * ArrayList存储字符串并遍历泛型
	 */

	public static void main(String[] args) {
//		demo1();
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("张三",23));
		list.add(new Person("李四",24));
		list.add(new Person("王五",25));
		list.add(new Person("赵六",26));
		Iterator<Person> it = list.iterator();//迭代器
		while(it.hasNext()) {
			Person p = it.next();//将集合中的每个person记录
			System.out.println(p.getName()+"...."+p.getAge());
			
		}
		
	}

	private static void demo1() {
		ArrayList<String> list = new ArrayList<>();//创建集合对象
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator <String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
