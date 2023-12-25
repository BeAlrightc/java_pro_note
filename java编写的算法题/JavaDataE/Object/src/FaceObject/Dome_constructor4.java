 package FaceObject;

public class Dome_constructor4 {

	public static void main(String[] args) {
		student1 stu1 = new student1();
		stu1.setName("张三");
		stu1.setAge(25);
	
		System.out.println("我的姓名是："+stu1.getName()+"，我的年龄是："+stu1.getAge());
		//getxxx()获取属性值，可以打印，也可以赋值给其他的变量，做其他的操作
		student1 s2 = new student1("李四",25);
		
		s2.show();
	}

}
/*
 * A.案例演示;
 * 		学生类：
 *  成员变量;
 *  	name,age
 *  构造方法
 *  	无参，带两个参
 *   成员方法;
 *   getxxx() / setxxx()
 *   show():输出该类的所有成员变量值
 *   
 *  B：给成员变量赋值;
 *  	a:setxxx()方法
 *  	b:构造方法
 *  
 *  C；输出成员变量值的方式：
 *   a:通过getxx()分别获取然后拼接
 *   b:通过调用show()方法搞定
 *   
 */
class student1{
	private String name;//名字
	private int age;//年龄
	
	public student1() {//空参构造器
		
	}
	public student1(String name,int age) {//有参构造器
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void show() {
		System.out.println("我的姓名是："+name+" 我的年龄是："+age);
	}
}
