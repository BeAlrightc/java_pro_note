package faceObject2;

public class Demo_Car {

	public static void main(String[] args) {
		Car c1 =new Car();//��������
		
		//�������Բ���ֵ
		c1.color="red"; //Ϊ������ɫ��ֵ
		c1.number=8;//������̥��
		c1.run();//���÷���
		
		Car c2 =new Car();
		c2.color="black";
		c2.number=4;
		c2.run(); 
		//c2=null; //��null��ԭ���ĵ�ֵַ���ǵ���
		//c2.run();//c2�����¼����null,���Ա�����ָ���쳣
		
		Car c3 =c2;
		c3.run();
	}

}
/*
 * ��������
 * 	������ɫ��
 * ������̥��
 * ������Ϊ��
 * ������
 */

class 	Car{
	String color;//������ɫ
	int number;//������̥��
	
	public void run() {//������
		System.out.println(color+"......"+number);
	}
}