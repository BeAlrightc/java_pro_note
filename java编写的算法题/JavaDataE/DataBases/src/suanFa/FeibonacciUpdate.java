package suanFa;

import java.util.Scanner;
//�Ʋ���������������
public class FeibonacciUpdate {

	public static void main(String[] args) {
		 System.out.println("������Ҫ���쳲��������е�ǰ������");
		 Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		 for(int i =1;i<=n;i++) {
			 System.out.print(Fibonacci(i)+" ");
		 }	
	}
		
	
	public static int Fibonacci(int n) {
		if(n<=2) {
			return 1;
		}else {
			return Fibonacci(n-1)+Fibonacci(n-2);
		}
	
	}
}
