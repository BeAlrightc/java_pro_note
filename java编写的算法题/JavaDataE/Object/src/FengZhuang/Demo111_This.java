package FengZhuang;
/*
 * A:this�ؼ��ֵ��ص�
 * ����ǰ���������
 */

public class Demo111_This {

	public static void main(String[] args) {
		Person p1 =new Person();
		p1.setName("����");
		p1.setAge(23);
		System.out.println(p1.getName()+"...."+p1.getAge());
		
		Person p2 =new Person();
		p2.setName("����");
		p2.setAge(24);
		System.out.println(p2.getName()+"...."+p2.getAge());
	}

}

class Person{
	private String name; //����
	private int age;//����
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {//��ȡ����
		return age;
	}


	public void setAge(int age) {//��������
		if(age>0&& age<200) {
		this.age = age;
	}else {
		System.out.println("��ػ��ǰɣ������ʺ���");
	 }
	}


	public void speak() {
		System.out.println(name+"...."+age);
	}
	
}