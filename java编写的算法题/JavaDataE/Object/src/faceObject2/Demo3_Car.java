package faceObject2;

public class Demo3_Car {

	public static void main(String[] args) {
		/*Car c1 =new Car();//���������ֵĶ���
		c1.run();//����һ�ζ���
		c1.run();
		new Car().run(); //����������ã�������һ���������������ס��ÿnewһ�ξ;��ڶ��ڴ��п���һ���ռ䴴��һ������
		new Car().run(); */ //��������ֻ�ʺ϶Է�����һ�ε��ã���Ϊ���ö�ξͻ����������󣬲����������ֵĶ���
	
		//���������Ƿ���Ե������Բ���ֵ����ʲô���壿
		/*
		 * ����������Ե������ԣ�����û�����壬��Ϊ���ú�ͱ��������
		 * �����Ҫ��ֵ�����������ֵ�
		 */
		new Car().color="��ɫ";
		new Car().num=8;
		new Car().run();
				
	}

}


class Car{
	String color;//��ɫ
	int num;//��̥��
	
	public void run() {
		System.out.println(color+"...."+num);
	}
}
