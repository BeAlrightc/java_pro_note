
public class Animal {
	 String name;
	 int id;
	 String sex;
	
	
	public void eat() {//方法1
		System.out.println("吃饭");
	}
	public void sleep() {//方法2
		System.out.println("睡觉");
	}

public static void f() {//方法3
	System.out.println("呼吸");
}

	public static void main(String[] args) {
		Animal c = new Animal();//建立名字叫做c的对象
		c.eat();//c调用方法1，输出吃饭
		c.sleep();//c调用方法1，输出睡觉
		c.f();//c调用
		f();//静态方法，没有c调用
	}

}
