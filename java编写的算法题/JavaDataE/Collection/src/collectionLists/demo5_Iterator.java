package collectionLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import bean.Student;

public class demo5_Iterator {
	/*
	 * 迭代
	 *  A.迭代概述1
	 *  集合是用来存储元素，存储的元素需要查看，那么就需要迭代（遍历）
	 * 
	 */

	public static void main(String[] args) {
//		demo1();
		Collection c =new ArrayList();
		c.add(new Student("张三",23));//当Object obj1 = new Student("张三",23);
		c.add(new Student("李四",24));
		c.add(new Student("王五",25));
		c.add(new Student("赵六",26));
		//获取迭代器
		Iterator it = c.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			Student s = (Student)it.next();
			System.out.println(s.getName()+"..."+s.getAge());
		}
	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		//集合中的元素进行迭代（遍历）
		Iterator it = c.iterator();//获取迭代器
//		boolean b1 =it.hasNext();//判断集合中是否有元素，有则返回true
//		Object obj1 = it.next();//可以将指针向后移动一位
//		System.out.println(b1);
//		System.out.println(obj1);
//		
//		boolean b2 =it.hasNext();//判断集合中是否有元素，有则返回true
//		Object obj2 = it.next();
//		System.out.println(b2);
//		System.out.println(obj2);
	
		while(it.hasNext()) {
			Object b2 = it.next();
			System.out.println(b2);
		}
	}

}
