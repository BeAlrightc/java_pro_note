package JIHe;

public class Person implements Comparable{
	int id;
	int age;
	String name;

	public Person(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Object o) {
		Person p;
		if(o instanceof Person) {
			p=(Person)o;
		}else {
			return -1;
		}
		int diff = this.age - p.age;
		if(diff!=0) {
			diff= diff/Math.abs(diff);
		}
		
		return diff;
	}

}
