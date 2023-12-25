package Listp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo3_List {
	/*
	 * A；案例演示：
	 * 需求：我有一个集合，请问，我想判断里面有没有“World”这个元素，如果有我就添加一个Javaee元素，code
	 */

	public static void main(String[] args) {
		List list = new ArrayList();//由于集合中只能放对象，所以以下的字符串将会提升为Object类
		list.add("a");//相当于 Object obj = new String();
		list.add("b");
		list.add("c");
		list.add("world");
		list.add("d");
		//方法1,使用自制for循环参与
		/*
		for(int i =0;i<list.size();i++) {
			if(list.get(i)=="world") {
				list.add("javaee");
			}
			System.out.println(list.get(i));
		}
		*/
		//方法2,使用跌迭代器：
		/*
		Iterator  it  = list.iterator();//获取迭代器
		while(it.hasNext()) {//判断集合中是否有元素
			String str =(String) it.next();//向下转型
			if("world".equals(str)) {//满足条件时
				list.add("javaee");//此操作为遍历的同时再增加，称为并发修改ConcurrentModificationException
			}
		}
		*/
		ListIterator lit = list.listIterator();//获取迭代器（list空集合特有的）
		while(lit.hasNext()) {
			String str = (String)lit.next();
			if("world".equals(str)) {
				//list.add("javaee");用此方式依然会报异常
				lit.add("javaee");
			}
		}
		System.out.println(list);
	}

}
