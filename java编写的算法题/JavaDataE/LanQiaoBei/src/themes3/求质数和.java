package themes3;

import java.util.Scanner;

public class �������� {//����Ҫ�࿴��
	/*
	 * ����֪����һ�������� 2���ڶ���������
	 *  3�������������� 5����
	 *  ������� �� 2019 �������Ƕ��٣�
	 */

	public static void main(String[] args) {
		System.out.println("����������������");
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int ans=0;//���ڼ�¼�ڼ�������
		int res=0;//���ڼ�¼��������ֵ
		while(ans<=A) {
			res++;//������������(�ȼ�һ)
			if(check(res)) {//���ͨ�����
				ans++;//������һ
			}
		}
     System.out.println(res);
	}

	private static boolean check(int nums) {//�˷������ڼ���Ƿ�Ϊ����
		int flag=0;//���ñ�־
		for(int i=2;i<nums;i++) {//������һ������i<nums i�����Ե���2
			if(nums%i==0) {
				flag=1;//����Ϊ��־
				break;
			}
		}
		if(flag==1) {//�����־Ϊ1
			return false;//���ش�
		}else {
			return true;//���ض�
		}
		
	}

}
