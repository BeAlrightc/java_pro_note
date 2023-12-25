package collectionLists;

import java.util.ArrayList;
import java.util.Collection;

import bean.Student;


public class demo3 {
	/*
	 * A:集合的遍历
	 * 	其实就是依次获取集合中的每一个元素
	 * 案例：
	 * 		将集合转换成数组，可以实现遍历集合的遍历
	 * toArrray()
	 */

	
	
	public static void main(String[] args) {
		//demo1();
		Collection c = new ArrayList();
		c.add(new Student("张三",23));
		c.add(new Student("李四",24));
		c.add(new Student("王五",25));
		c.add(new Student("赵6",26));
		Object[]  arr =c.toArray();
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			Student s = (Student)arr[i];//强制转换成Student类型
			System.out.println(s.getName() + "..."+s.getAge());
		}
		

	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		Object [] arr =c.toArray();//将集合转换成数组
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
