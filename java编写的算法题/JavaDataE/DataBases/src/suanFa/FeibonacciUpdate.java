package suanFa;

import java.util.Scanner;
//菲波那切数列升级版
public class FeibonacciUpdate {

	public static void main(String[] args) {
		 System.out.println("请问需要输出斐波那契数列的前多少项");
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
