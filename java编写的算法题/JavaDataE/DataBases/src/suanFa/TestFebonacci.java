package suanFa;

import java.util.Scanner;

public class TestFebonacci {

	public static void main(String[] args) {
		//쳲��������� ��1 1 2 3 5 8 13...
//		int i =febonacci(5);
//		System.out.println(i);
System.out.println("������������");
		 Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		 System.out.println("��쳲���������Ϊ��");
		 for(int i =1;i<=n;i++) {
			 System.out.print(febonacci(i)+" ");
		 }
	}
	//��ӡ��N��쳲���������
	public static int febonacci(int i) {
		if(i==1 || i==2) {//�����Ż�i<=2
			return 1;
		}else {
			return febonacci(i-1)+febonacci(i-2);//���еݹ����
		}
	}

}
