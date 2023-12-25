package suanFa;

import java.util.Scanner;

public class TestFebonacci {

	public static void main(String[] args) {
		//斐波那契数列 ：1 1 2 3 5 8 13...
//		int i =febonacci(5);
//		System.out.println(i);
System.out.println("请输入项数：");
		 Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		 System.out.println("该斐波那契数列为：");
		 for(int i =1;i<=n;i++) {
			 System.out.print(febonacci(i)+" ");
		 }
	}
	//打印第N项斐波那契数列
	public static int febonacci(int i) {
		if(i==1 || i==2) {//可做优化i<=2
			return 1;
		}else {
			return febonacci(i-1)+febonacci(i-2);//进行递归调用
		}
	}

}
