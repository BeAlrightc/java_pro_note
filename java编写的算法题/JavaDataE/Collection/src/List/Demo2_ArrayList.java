package List;

import java.util.ArrayList;
import java.util.Iterator;

import bean.Person;

public class Demo2_ArrayList {
	/*
	 * A:案例演示：
	 *   需求：ArrayList去除集合中自定义对象元素的重复值（对象成员变量值相同）
	 * B：注意事项
	 * 		重写equals()方法的
	 * contains方法判断是否包含，底层依赖的是equals方法
	 *
	 */

	public static void main(String[] args) {
		ArrayList list = new ArrayList();//创建集合对象
		list.add(new Person("张三",23));
		list.add(new Person("张三",23));
		list.add(new Person("李四",24));
		list.add(new Person("李四",24));
		list.add(new Person("李四",24));
		list.add(new Person("李四",24));
		
		ArrayList newlist=getSingle(list);
		System.out.println(newlist);
		list.remove(new Person("张三",23));
		System.out.println(list);
	}

	public static ArrayList getSingle(ArrayList list) {
		 ArrayList newList = new ArrayList<>();
		 
		 Iterator it =list.iterator();//获取迭代器
		 while(it.hasNext()) {
			 Object obj = it.next();
			 if(!newList.contains(obj)) {
				 newList.add(obj);
			 }
		 }
		 return newList;
	}
}
