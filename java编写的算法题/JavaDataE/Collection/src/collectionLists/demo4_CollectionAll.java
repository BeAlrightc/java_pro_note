package collectionLists;

import java.util.ArrayList;
import java.util.Collection;

public class demo4_CollectionAll {/**
	 * 案例演示：
	 * 		带All的功能演示
	 * 		boolean addAll(Collection c)//将一个集合当中的元素添加到另一个集合当中
	 * 		boolean removeAll(Collection c)//删除两个集合之间的交集元素
	 * 		boolean containsAll(Collection c)//查看一个集合是否包含另一一个集合中的全部元素
	 * 		boolean retainAll(Collection c)//取交集
	 */

	public static void main(String[] args) {
//		demo1();
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList(); //alt +shift+R可以改名
//		c2.add("a");
//		c2.add("b");
		c2.add("f");
		
		
		//boolean b = c1.containsAll(c2);//查看c1是否包含c2的元素
		
		//取交集，如果调用的集合改变就返回true，如果调用的集合不变就返回false
		boolean b = c1.retainAll(c2);//取交集
		System.out.println(b);
		System.out.println(c1);
		System.out.println(c2);

	}

private static void demo1() {
	Collection c1 = new ArrayList();
	c1.add("a");
	c1.add("b");
	c1.add("c");
	c1.add("d");
	
	Collection c2 = new ArrayList(); //alt +shift+R可以改名
	c2.add("a");
	c2.add("b");
	c2.add("c");
	c2.add("d");
	
	c1.addAll(c2);//将c2的每一个元素添加到c1中
	//c1.add(c2);//将c2看成一个对象添加到c1中
	
	System.out.println(c1);
}

}
