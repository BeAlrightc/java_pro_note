package DoubleCircle;
/*
 * ѭ����Ƕ��
 */

public class Demo1_Forfor {

	public static void main(String[] args) {
//		demo1();
		demo2();

	}

	private static void demo2() {//��ӡ4��5�е�����
		for(int i=1;i<=4;i++) {//��ѭ����������
			for(int j=1;j<=4;j++ ) {//��ѭ����������
				System.out.print("*");//���*
			}
			System.out.println();//����
		}
	}

	private static void demo1() {
		for(int i=1;i<=3;i++) {//��ѭ��
			System.out.println("i = "+i);
			for(int j =1;j<=3;j++) {//��ѭ��
				System.out.println("j = "+j);
			}
		}
		
	}

}
