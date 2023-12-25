package FaceObject;

public class Demo2_Person {

	public static void main(String[] args) {
Person p = new Person();
p.speak();
	}

}

class Person{
	String name; //成员变量默认初始化为null,在堆内存
	
	int num=20;//如果成员变量与局部变量同名，就近原则,选局部
	public void speak() { //x和num都为局部变量
		int num = 10;//使用之前必须初始化
		System.out.println(name);
		//num = 10;
		System.out.println(num);
	}
	
}