package Constructordemo1;

public class Demo_constructor2 {

	public static void main(String[] args) {
		Person2 p  =new Person2();
		p.show();
		System.out.println(".........");
		Person2 p2  =new Person2("����",23);
		p2.show();
		
	}

}
/*
 * A:������ʾ
 * 	���췽��������
 * ���أ���������ͬ���뷵��ֵ�����޹أ����췽��û�з���ֵ����ֻ�������б�
 * B�����췽��ע������
 *  a:�������û�и������췽����ϵͳ���Զ�Ϊ�����ṩһ���޲ι��췽����
 *  b:������Ǹ����˹��췽����ϵͳ�������ṩĬ�ϵ��޲ι��췽��
 *   ע�⣺���ʱ��������ǻ���ʹ���޲ι��췽�����ͱ����Լ�������������Զ�Լ��������췽��
 */

class Person2{
	private String name ;   //����
	private int age;        //����
	
	public Person2() {  //�ղι���
		System.out.println("���ǿղεĹ���");
	}
	//�вι���ĺô��ǿ��Զ�̬��Ϊ������ֵ
	public Person2(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("�вεĹ���");
	}
	
	public void show() {
		System.out.println(name+"....."+age);
		
	}
}
