 package FaceObject;

public class Dome_constructor4 {

	public static void main(String[] args) {
		student1 stu1 = new student1();
		stu1.setName("����");
		stu1.setAge(25);
	
		System.out.println("�ҵ������ǣ�"+stu1.getName()+"���ҵ������ǣ�"+stu1.getAge());
		//getxxx()��ȡ����ֵ�����Դ�ӡ��Ҳ���Ը�ֵ�������ı������������Ĳ���
		student1 s2 = new student1("����",25);
		
		s2.show();
	}

}
/*
 * A.������ʾ;
 * 		ѧ���ࣺ
 *  ��Ա����;
 *  	name,age
 *  ���췽��
 *  	�޲Σ���������
 *   ��Ա����;
 *   getxxx() / setxxx()
 *   show():�����������г�Ա����ֵ
 *   
 *  B������Ա������ֵ;
 *  	a:setxxx()����
 *  	b:���췽��
 *  
 *  C�������Ա����ֵ�ķ�ʽ��
 *   a:ͨ��getxx()�ֱ��ȡȻ��ƴ��
 *   b:ͨ������show()�����㶨
 *   
 */
class student1{
	private String name;//����
	private int age;//����
	
	public student1() {//�ղι�����
		
	}
	public student1(String name,int age) {//�вι�����
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
		System.out.println("�ҵ������ǣ�"+name+" �ҵ������ǣ�"+age);
	}
}
