package Constructordemo1;

public class Test_Employee {

	public static void main(String[] args) {
Employee e = new Employee("令狐冲","9527",1900);
e.work();
	}

}
/*
 * A:案例演示：
 * 	需求：定义一个员工类Employee
 *	自己分析出几个成员，然后给出成员变量
 *		姓名name,工号id,工资salary
 *构造方法
 *		空参和有参
 *get和set方法
 *以及一个显示所有成员信息的方法，并测试
 *work
 */

class Employee{
	private String name;
	private String id;
	private int salary;
	
	public Employee() {
		
	}

	public Employee(String name, String id, int salary) {
	
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void work() {
		System.out.println("我的姓名是："+name+",我的工号是："+id+",我的工资是"+salary+",我的工作内容是：敲代码");
	}
}

