package fengzhuag2;
/*
 * A:���ำֵ��������
 * B:private�ؼ����ص�
 * 	a:��һ��Ȩ�����η�
 * 	b:�������γ�Ա�����ͳ�Ա����
 * 	c:�������εĳ�Աֻ���ڱ����б�����
 * C��������ʾ��
 * ��װ��private��ʹ�ã�
 * A���ѳ�Ա������private����
 * B:�ṩ��Ӧ��getXXX������setXXX()������֤��ȫ
 * private�����Ƿ�װ��һ��������ʽ������˵��װ����˽��
 */

public class Demo11_Peerson {

	public static void main(String[] args) {
		Person p1 =new Person();
//		p1.name="����";//������������ֵ
//		p1.age=23;//�������䲢��ֵ
		p1.setAge(17);
		System.out.println(p1.getAge());
		//p1.speak();//���÷���

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


	public void setAge(int a) {//��������
		if(a>0&& a<200) {
		age = a;
	}else {
		System.out.println("��ػ��ǰɣ������ʺ���");
	 }
	}


	public void speak() {
		System.out.println(name+"...."+age);
	}
	
}
