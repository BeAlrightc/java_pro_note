package StaticKnows;

public class Demo_static {

	public static void main(String[] args) {
	/*	Person p1 = new Person();//�������� 
		p1.name="����ʦ";
		p1.country="�ձ�";
		
		
		Person p2 = new Person();
			p2.name="С����ʦ";
			//p2.country="�ձ�";
			p2.speak();
			p1.speak();
			*/
		Person.country="�й�";//��̬����һ�ֵ��÷�ʽ������ͨ������/����.fangfa���е���.
		System.out.println(Person.country);
	}

}
class Person{
	String name; //����
	static String country; //����
	
	public void speak() {//˵���ķ���
		System.out.println(name+"...."+country);
	}
}
