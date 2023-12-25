package DUOTAI;

public class Person {
   private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
   
	
	public Person() {
		super();
	}


	public void display() {
		System.out.println("name:"+ name);
	}
	public void speak() {
		System.out.println("我什么也没说");
	}
	
	public void speak(String message) {
		System.out.println("我说了："+message);
	}
}
