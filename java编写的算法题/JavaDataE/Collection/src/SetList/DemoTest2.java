package SetList;

import java.util.HashSet;

import bean.Person;

public class DemoTest2 {

	public static void main(String[] args) {
		HashSet<Person> hs = new HashSet<>();//�����༯��
		hs.add(new Person("����",23));
		hs.add(new Person("����",23));
		hs.add(new Person("����",24));
		hs.add(new Person("����",24));
		hs.add(new Person("����",24));
		hs.add(new Person("����",24));
		for (Person person : hs) {
			System.out.println(person);
		}
		
		
	}

	}


