package themes3;

import java.util.Scanner;

public class ��ɼ� {
	/*
	 * С����ѧ������֯��һ�����ԣ������ܷ�Ϊ 100 �֣�ÿ��ѧ���ĵ÷ֶ���һ�� 0 �� 100 ��������
����÷������� 60 �֣����Ϊ��������÷�����Ϊ 85 �֣����Ϊ���㡣
����㼰���ʺ������ʣ��ðٷ�����ʾ���ٷֺ�ǰ�Ĳ����������뱣��������

�������ʽ��

����ĵ�һ�а���һ������ n����ʾ����������
������ n �У�ÿ�а���һ�� 0 �� 100 ����������ʾһ��ѧ���ĵ÷֡�

�������ʽ��

������У�ÿ��һ���ٷ������ֱ��ʾ�����ʺ������ʡ��ٷֺ�ǰ�Ĳ����������뱣��������

	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		System.out.println(N);
		double[] arr = new double[N];//����һ�����飨�������СΪN��
		double YO=0;//��������
		double ji=0;//��������
		for(int i=0;i<N;i++) {//����
			arr[i]=sc.nextDouble();//���α�������ɼ�����
			if(arr[i]>=60) {//����ɼ�����60
				ji++;
			}
			if(arr[i]>=85) {//����ɼ�����85
				YO++;
			}
		
		}
		System.out.println(ji);
		System.out.println(YO);
		System.out.println(Math.round((ji/N)*100)+"%");//ʹ��round����������������ȡ��
		System.out.println(Math.round((YO/N)*100)+"%");
		
	}

}
