package Constructordemo1;

public class Demo_constructor3 {

	public static void main(String[] args) {
		Person3  p1 = new Person3("����",23);
		//���������´�����һ������
		p1 = new Person3("����һ",24);//�������¸�ֵ��ԭ���Ķ���ͱ������
		System.out.println(p1.getName()+"....."+p1.getAge());
		
		System.out.println("---------------");
		Person3 p2 = new Person3();
		p2.setName("����");
		p2.setAge(24);
		p2.setName("���");//����set�����޸�����ֵ��Ϊ�Ƚ���������õıȽ϶�
		System.out.println(p2.getName()+"....."+p2.getAge());
	}

}
class Person3{
	private String name;
	private int age;
	
	public Person3() {
		
	}
	public Person3(String name,int age) {//�вι���
		this.name = name;
		this.age = age;
		
	}
	public void setName(String name) {//��������
		this.name = name;
	}
	public String getName() {  //��ȡ����
		return name;
	}
	public void setAge(int age) { //��������
		this.age = age;
	}
	public int getAge() { //��ȡ����
		return age;
	}
	
}