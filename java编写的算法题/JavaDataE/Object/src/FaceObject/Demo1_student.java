package FaceObject;

public class Demo1_student {

	public static void main(String[] args) {
		print(10);
	student s = new student();//��������	���ؽ�����ĵ�ֵַ��ֵ��s
	print(s);

	}
	public static void print(int x) {//�����������͵�����ʽ����
		System.out.println(x);
	}
	public static void print(student stu) {//�����������͵�����ʽ����
		stu.name="����";
		stu.age = 23;
		stu.speak();
	}
}
 class student{
	 String name ;//����
	 int age;//����
	 
	public void speak() {
		System.out.println(name+ "....."+ age);
	}
	 
 }