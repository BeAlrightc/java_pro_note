package FengZhuang;
/*
 * A:this关键字的特点
 * 代表当前对象的引用
 */

public class Demo111_This {

	public static void main(String[] args) {
		Person p1 =new Person();
		p1.setName("张三");
		p1.setAge(23);
		System.out.println(p1.getName()+"...."+p1.getAge());
		
		Person p2 =new Person();
		p2.setName("李四");
		p2.setAge(24);
		System.out.println(p2.getName()+"...."+p2.getAge());
	}

}

class Person{
	private String name; //姓名
	private int age;//年龄
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {//获取年龄
		return age;
	}


	public void setAge(int age) {//设置年龄
		if(age>0&& age<200) {
		this.age = age;
	}else {
		System.out.println("请回火星吧，地球不适合你");
	 }
	}


	public void speak() {
		System.out.println(name+"...."+age);
	}
	
}