package StaticKnows;

public class Demo_static {

	public static void main(String[] args) {
	/*	Person p1 = new Person();//创建对象 
		p1.name="仓老师";
		p1.country="日本";
		
		
		Person p2 = new Person();
			p2.name="小泽老师";
			//p2.country="日本";
			p2.speak();
			p1.speak();
			*/
		Person.country="中国";//静态多了一种调用方式，可以通过类名/对象.fangfa进行调用.
		System.out.println(Person.country);
	}

}
class Person{
	String name; //姓名
	static String country; //国籍
	
	public void speak() {//说话的方法
		System.out.println(name+"...."+country);
	}
}
