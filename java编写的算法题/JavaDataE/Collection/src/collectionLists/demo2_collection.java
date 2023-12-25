package collectionLists;

import java.util.ArrayList;
import java.util.Collection;

import bean.Student;

public class demo2_collection {
	/*
	 * collection集合的使用
	 * add方法如果是List集合一直都返回true,因为List集合是可以存放重复元素的
	 * 如果是set集合当存储元素的时候就会返回false
	 * ArrayList的父类的父类重写toString方法，所依在打印对象的引用的时候，输出的结果不是Object类中的toString
	 */

	public static void main(String[] args) {
		//demo1();
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		c.add("e");
		System.out.println(c);
		System.out.println(c.size());
		//c.remove("b");//删除指定元素
		//c.clear();//清空集合
	
		//System.out.println(c.contains("b"));
		System.out.println(c.isEmpty());
	}

	private static void demo1() {
		@SuppressWarnings("rawtypes")
		Collection c = new ArrayList();//父类引用指向对象
		
		boolean b1 = c.add("abc");
		boolean b2 = c.add(true);//自动装箱 new Boolean(true)
		boolean b3 = c.add(100);
		boolean b4 =c.add(new Student("张三",23));
		boolean b5 = c.add("abc");

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		System.out.println(c);
	}
	

}
