package cn.xmcu.test;

public class Person1 {
	private String name;
	
	private int age;
	
	

	public Person1(String name, int age) {
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
	
	private void addAge() {
		age++;
	}
	public void display() {
		System.out.println("我今年45岁，我的名字叫刘发财");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person1 person = new Person1("刘发财",45);
       person.display();
       person.addAge();
       String name = person.getName();
       int age = person.getAge();
       
       System.out.println("name="+name+" age="+age);
       
	

       }
}
