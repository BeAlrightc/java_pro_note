package FaceObject;

public class Demo1_student {

	public static void main(String[] args) {
		print(10);
	student s = new student();//创建对象	，必将对象的地址值赋值给s
	print(s);

	}
	public static void print(int x) {//基本数据类型当作形式参数
		System.out.println(x);
	}
	public static void print(student stu) {//引用数据类型当作形式参数
		stu.name="张三";
		stu.age = 23;
		stu.speak();
	}
}
 class student{
	 String name ;//姓名
	 int age;//年龄
	 
	public void speak() {
		System.out.println(name+ "....."+ age);
	}
	 
 }