package Constructordemo1;

public class Test_Employee {

	public static void main(String[] args) {
Employee e = new Employee("�����","9527",1900);
e.work();
	}

}
/*
 * A:������ʾ��
 * 	���󣺶���һ��Ա����Employee
 *	�Լ�������������Ա��Ȼ�������Ա����
 *		����name,����id,����salary
 *���췽��
 *		�ղκ��в�
 *get��set����
 *�Լ�һ����ʾ���г�Ա��Ϣ�ķ�����������
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
		System.out.println("�ҵ������ǣ�"+name+",�ҵĹ����ǣ�"+id+",�ҵĹ�����"+salary+",�ҵĹ��������ǣ��ô���");
	}
}

