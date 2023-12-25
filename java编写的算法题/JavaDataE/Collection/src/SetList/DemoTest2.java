package SetList;

import java.util.HashSet;

import bean.Person;

public class DemoTest2 {

	public static void main(String[] args) {
		HashSet<Person> hs = new HashSet<>();//对象类集合
		hs.add(new Person("张三",23));
		hs.add(new Person("张三",23));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		hs.add(new Person("李四",24));
		for (Person person : hs) {
			System.out.println(person);
		}
		
		
	}

	}


