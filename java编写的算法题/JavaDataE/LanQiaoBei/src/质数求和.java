import java.util.Scanner;

public class ������� {
	/*
	 * ����֪����һ�������� 2���ڶ���������
	 *  3�������������� 5����
	 *  ������� �� 2019 �������Ƕ��٣�
	 */

	public static void main(String[] args) {
	System.out.println("����������Ҫ�������������");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int er=0;
	int ou=0;
	while(ou<=a) {
		er++;
		if(check(er)) {
			ou++;
		}
	}
	System.out.println(er);
	
	}

	private static boolean check(int er) {
		int flag=0;
		for(int i=2;i<er;i++) {
			if(er%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			return false;
		}else {
			return true;
		}
	}


		
	

}
