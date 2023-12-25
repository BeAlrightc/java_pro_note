package Constructordemo1;

public class Demo_constructor3 {

	public static void main(String[] args) {
		Person3  p1 = new Person3("张三",23);
		//下面是重新创建了一个对象
		p1 = new Person3("张天一",24);//对象重新赋值，原来的对象就变成垃圾
		System.out.println(p1.getName()+"....."+p1.getAge());
		
		System.out.println("---------------");
		Person3 p2 = new Person3();
		p2.setName("李四");
		p2.setAge(24);
		p2.setName("李桂");//利用set方法修改属性值因为比较灵活所有用的比较多
		System.out.println(p2.getName()+"....."+p2.getAge());
	}

}
class Person3{
	private String name;
	private int age;
	
	public Person3() {
		
	}
	public Person3(String name,int age) {//有参构造
		this.name = name;
		this.age = age;
		
	}
	public void setName(String name) {//设置姓名
		this.name = name;
	}
	public String getName() {  //获取姓名
		return name;
	}
	public void setAge(int age) { //设置年龄
		this.age = age;
	}
	public int getAge() { //获取年龄
		return age;
	}
	
}