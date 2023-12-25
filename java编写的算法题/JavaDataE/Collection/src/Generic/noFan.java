package Generic;

import bean.Student;
import bean.Worker;

public class noFan {
	/*
	 * A:案例演示
	 * 泛型的由来:通过Object转型问题引入
	 * 早期的object类型可以接收任意的对象类型，但是在实际的使用中，会有类型转换的问题，也就存在隐患，所以java提供了泛型来解决
	 */

	public static void main(String[] args) {
//		demo1();
		Tool<String> t= new Tool<>();
		t.show("abc");
		t.show(true);
	}

	private static void demo1() {
		Tool<Student> t = new Tool<>(); //创建工具类对象
		t.setObj(new Student("张三",23));
		
//		Worker w = (Worker)t.getObj(); //向下转型
//		System.out.println(w);
	}

}
