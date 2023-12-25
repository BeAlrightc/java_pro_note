package Listp;

import java.util.ArrayList;
import java.util.List;

import bean.Student;

public class demo2_list {
	
	/*
	 * A:案例演示：
	 * 	向List集合中存储学生对象
	 * 通过size()和get()方法结合使用演示
	 */

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Student("张三",23)); //Object ogj = new Student("张三",23)
		list.add(new Student("李四",24));
		list.add(new Student("王五",25));
		list.add(new Student("赵六",26));
		
		for(int i =0;i<list.size();i++) {
			//System.out.println(list.get(i));//通过索引获取每一个元素
		Student s = (Student)list.get(i);
		System.out.println(s.getName()+"...."+s.getAge());
		}
	}

}
