package Listp;

import java.util.ArrayList;
import java.util.List;

public class demo1_list {
	/*
	 * void add(int index,E element)
	 * E remove(int index)
	 * E get(int index)
	 * E set(int index,E element)
	 */

	public static void main(String[] args) {
//		demo2();
//		demo1();
//		demo3();
//		demo4();
		List list =new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.set(1, "z");//将制定位置的元素修改为一个新的
		System.out.println(list);
	}

	private static void demo4() {
		List list =new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		//Object obj1 = list.get(0);//通过索引值获取集合中的某1个元素
		//System.out.println(obj1);
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

	private static void demo3() {
		List list =new ArrayList();
		list.add(111);
		list.add(222);
		list.add(333);
		
		list.remove(111);//删除的时候不会自动装箱，把整数当作索引
		System.out.println(list);
	}

	private static void demo1() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Object obj = list.remove(1);//通过索引删除元素，将被删除的元素返回
		System.out.println(obj);
		System.out.println(list);
	}

	private static void demo2() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(1,"e");  //index <=size都不会报错，并且index>=0
		//list.add(6,"r");//当索引数量不存在时就出出现索引值异常
		
		System.out.println(list);
	}

}
