package themes2;

import java.util.Scanner;

public class ��� {
	/*
	 * С������λ�к��� 2��0��1��9 �����ֺܸ���Ȥ��
	 * �� 1 �� 40 ������������ �� 1��2��9��10 �� 32��39 �� 40��
	 * �� 28 �������ǵĺ��� 574�� ���ʣ��� 1 �� 2019 �У��������������ĺ��Ƕ��٣�
	 */

	public static void main(String[] args) {
		System.out.println("��������Ӧ������");
		Scanner cs = new Scanner(System.in);
		int n = cs.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			String temp =i+"";
			if(temp.contains("2")||temp.contains("0")||temp.contains("1")||temp.contains("9")) {
				sum +=i;
			}
		}
         System.out.println(sum);
	}

}
