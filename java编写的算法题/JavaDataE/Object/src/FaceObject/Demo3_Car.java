package FaceObject;

public class Demo3_Car {

	public static void main(String[] args) {
	//Car c1 =new Car();
	/*c.color="red";
	c.num=8;
	c.run();*/
	//method(c1);
	
	method(new Car());
//	Car c2 =new Car();
//	method(c2);
	method(new Car()); //����������Ե�����������
	}
	//��ȡ������ߴ��븴����
	public static void method(Car cc) {
		cc.color ="red";
		cc.num =8;
		cc.run();
	}

}

class Car{
	String color ; //��ɫ
	int num; //��̥��
	
	public void run() {
		System.out.println(color+"...."+num);
	}
}
