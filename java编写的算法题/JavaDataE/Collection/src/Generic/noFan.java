package Generic;

import bean.Student;
import bean.Worker;

public class noFan {
	/*
	 * A:������ʾ
	 * ���͵�����:ͨ��Objectת����������
	 * ���ڵ�object���Ϳ��Խ�������Ķ������ͣ�������ʵ�ʵ�ʹ���У���������ת�������⣬Ҳ�ʹ�������������java�ṩ�˷��������
	 */

	public static void main(String[] args) {
//		demo1();
		Tool<String> t= new Tool<>();
		t.show("abc");
		t.show(true);
	}

	private static void demo1() {
		Tool<Student> t = new Tool<>(); //�������������
		t.setObj(new Student("����",23));
		
//		Worker w = (Worker)t.getObj(); //����ת��
//		System.out.println(w);
	}

}
