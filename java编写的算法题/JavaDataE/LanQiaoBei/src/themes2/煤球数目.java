package themes2;

import java.util.Scanner;

public class ú����Ŀ {
	/*
	 * ��һ��ú�򣬶ѳ�������׶�Ρ����壺
��һ���1����
�ڶ���3�������г������Σ���
������6�������г������Σ���
���Ĳ�10�������г������Σ���
��
���һ����100�㣬���ж��ٸ�ú��

�����ʾú������Ŀ�����֡�
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�

	 */

	public static void main(String[] args) {
//		Scanner input=new Scanner(System.in);
//        int n=input.nextInt();
        int count=1;
        int sum=1;
        for(int i=2;i<=100;i++){

            count+=i;
            sum+=count;
        }
        System.out.println(sum);

	}

}
