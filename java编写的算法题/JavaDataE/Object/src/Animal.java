
public class Animal {
	 String name;
	 int id;
	 String sex;
	
	
	public void eat() {//����1
		System.out.println("�Է�");
	}
	public void sleep() {//����2
		System.out.println("˯��");
	}

public static void f() {//����3
	System.out.println("����");
}

	public static void main(String[] args) {
		Animal c = new Animal();//�������ֽ���c�Ķ���
		c.eat();//c���÷���1������Է�
		c.sleep();//c���÷���1�����˯��
		c.f();//c����
		f();//��̬������û��c����
	}

}
