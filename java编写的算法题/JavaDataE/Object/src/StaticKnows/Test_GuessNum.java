package StaticKnows;

import java.util.Scanner;

/*
 * A:������ʾ��
 * 	���󣺲�����С��Ϸ��������1-100֮�䣩
 * 
 */

 class Test_GuessNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//��������¼�����
		System.out.println("������һ����������Χ��1-100֮�䣺");
		int guessNum = (int)(Math.random() *100) +1; //������������
		while(true) {//��Ϊ��Ҫ�ºܶ�Σ�����������ѭ��
			int result =sc.nextInt(); //��Ҳµ���
			if(result >guessNum) {//������ǲµ����������������ʾ����
				System.out.println("����");
			}else if(result<guessNum) {//������ǲµ���С���������ʾЦ��
				System.out.println("С��");
			}else {//�µ��������в�С�Ͳ¶���
				System.out.println("�¶���");
				break;
			}
			
		}
	}

}
