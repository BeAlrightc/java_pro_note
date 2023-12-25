package Constructordemo1;

public class Daemo1_Student {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.show();
	}

}
class Student{
	private String name ="张三";
	private int age = 23;
	public Student() {
		name = "李四";
		age = 24;
	}
	public void show() {
		System.out.println(name+"......"+age);
	}
}