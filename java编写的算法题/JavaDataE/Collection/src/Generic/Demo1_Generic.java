package Generic;

import java.util.ArrayList;
import java.util.Iterator;

import bean.Person;

public class Demo1_Generic {
	/*
	 * A:泛型概述
	 * B：泛型的好处
	 * 		1.提高安全性1（将运行期的错误转换到编译期）
	 * 		2.省去强转的麻烦
	 * C.泛型的基本使用
	 * <>中放的必须是引用数据类型
	 * D:泛型使用的注意事项
	 *   前后的泛型必须一致，或者后面的泛型可以省略不写（jdk1.7的新特性菱形泛型）
	 *   <>里面放的是限定数据类型
	 */

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
//		list.add(110);
//		list.add(true);
		list.add(new Person("张三",23));
		list.add(new Person("李四",24));
		Iterator<Person> it =list.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			//Person p = (Person)it.next();//强转
			//next方法只能调用一个，如果调用多次会将指针向后移动多次
			//System.out.println(it.next().getName()+"..."+it.next().getAge());
		Person p = it.next();
		System.out.println(p.getName()+"...."+p.getAge());
			
		}
	}

}
