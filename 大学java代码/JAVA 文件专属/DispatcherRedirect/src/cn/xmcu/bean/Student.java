package cn.xmcu.bean;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public static final String STUDENT="student";
	private String name;
	private int age;

	public Student() {
		super();
	}


	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static List<Student>getData(){
		List<Student> data = new ArrayList<Student>(2);
		data.add(new Student("张三",23));
		data.add(new Student("李四",56));
		return data;
		
	}

}
