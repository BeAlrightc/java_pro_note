package DoubleCircle;

public class Chengfa {
	/*
	 * 
	 * ������žų˷���
	 */

	public static void main(String[] args) {
//		demo1();
System.out.println("\"");//ת��˫����
System.out.println('\'');//ת�嵥����
	}

	private static void demo1() {//��ӡ�žų˷���
		for(int i=1;i<=9;i++) {//��ӡ����
			for(int j=1;j<=i;j++) {//��ӡ����
				System.out.print(i+"*"+j+"="+i*j+'\t');//�����������Ӧ�ĸ�ʽ
			}
			System.out.println();
		}
	}

}
