package Constructordemo1;

public class Demo_constructor1 {

	public static void main(String[] args) {
		Person p = new Person();//��һ���������ʱ��ϵͳ�Ͱ����ǵ����˹��췽��
		//p.Person();   //���췽�������ö������
		p.show();
		
		Person p1 = new Person(); 
		p1.show();
	}
}
	
	/*
	 * A:���췽������������
	 * ����������ݣ����Խ��г�ʼ����
	 * B:���췽����ʽ�ص�
	 *  a:��������������ͬ����СҲҪ������һ�£�
	 *  b:û�з���ֵ���ͣ���void��û��
	 *  c:û�о���ķ���ֵreturn;
	 */

	class Person{
		private String name;
		private int age;
		
		
		//���췽��
		public Person() {
//			System.out.println("Helloworld");
//			return;  //���췽��Ҳ����return���ģ����ʽΪreturn;
		name = "����";
		age = 23;
		
		}
		
		public void show() {
			System.out.println(name+ "....."+age);
		}
	}

