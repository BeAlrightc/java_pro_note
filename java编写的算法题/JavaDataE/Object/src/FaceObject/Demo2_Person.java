package FaceObject;

public class Demo2_Person {

	public static void main(String[] args) {
Person p = new Person();
p.speak();
	}

}

class Person{
	String name; //��Ա����Ĭ�ϳ�ʼ��Ϊnull,�ڶ��ڴ�
	
	int num=20;//�����Ա������ֲ�����ͬ�����ͽ�ԭ��,ѡ�ֲ�
	public void speak() { //x��num��Ϊ�ֲ�����
		int num = 10;//ʹ��֮ǰ�����ʼ��
		System.out.println(name);
		//num = 10;
		System.out.println(num);
	}
	
}