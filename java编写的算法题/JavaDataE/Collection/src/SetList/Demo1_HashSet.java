package SetList;

import java.util.HashSet;

import bean.Person;

public class Demo1_HashSet {
	/*
	 * Set集合，无索引，不可以重复，无序（存取不一致）
	 * 只要可以使用迭代器迭代的就可以使用增强for循环进行遍历
	 */

	public static void main(String[] args) {
//		demo1();
		HashSet<Person> hs = new HashSet<>();//对象类集合
		hs.add(new Person("张三",24));
		hs.add(new Person("张三",24));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		System.out.println(hs);
		
	}

	private static void demo1() {
		HashSet<String> hs = new HashSet<>();
		boolean b1=hs.add("a");
		boolean b2=hs.add("a");//向集合中添加重复元素返回false
		hs.add("b");
		hs.add("c");
		hs.add("d");
		
		System.out.println(hs);//HashSet继承体系中重写toString方法
		System.out.println(b1);
		System.out.println(b2);//重复的值
		for (String string : hs) {//使用增强for循环进行迭代
			System.out.println(string);
		}
	}

}
