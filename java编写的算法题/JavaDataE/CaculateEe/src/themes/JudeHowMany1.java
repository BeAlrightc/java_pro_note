package themes;

import java.util.Scanner;

//�ж�һ�������Ķ������ж��ٸ�1
public class JudeHowMany1 {

	public static void main(String[] args) {
		System.out.println("������һ��������");
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println(N+"�Ķ�������Ϊ��"+Integer.toString(N,2));
		//way1
		int count =0;
		for(int i=0;i<32;i++) {
			if((N&(1<<i))==(1<<i)) {
				count++;
			}
		}
		System.out.println("�ö���������"+count+"��1");
		System.out.println("==============");
		
		//way2
		count=0;
		while(N!=0) {
			N=(N-1)&N;//ԭ��-1�ں�ԭ�����������������1
			count++;
		}
		System.out.println("�ö���������"+count+"��1");
		
		
	}

}
