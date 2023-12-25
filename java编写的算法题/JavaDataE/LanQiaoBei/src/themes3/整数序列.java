package themes3;

import java.util.Scanner;

public class 整数序列 {
	/*
	 * /*
	 * 有一个序列，序列的第一个数是 n，后面的每个数是前一个数整除 2，请输

出这个序列中值为正数的项。

【输入格式】

输入一行包含一个整数 n。

【输出格式】

输出一行，包含多个整数，相邻的整数之间用一个空格分隔，表示答案。

【样例输入】

20
1
【样例输出】

20 10 5 2 1
1

	 */
	 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a>0) {
			System.out.print(a +" ");
			a/=2;
		}

	}

}
