package com.heima.scanner;

import java.util.Scanner;

public class Demo2_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入第一个整数：");
//		int i = sc.nextInt();
//		System.out.println("请输入第二个整数");
//		int j = sc.nextInt();
//		System.out.println("i ="+i+",j="+j);
		
		
//		System.out.println("请输入第一个字符串：");
//		String line1 =sc.nextLine();
//		System.out.println("请输入第二个字符串：");
//		String line2 = sc.nextLine();
//		System.out.println("line1 = "+line1+",line2= "+line2);
		/*
		 * 
		 * nextInt()是键盘录入整数的方法，当我们录入23的时候
		 * 其实是在键盘上录入的是23和\r\n,nextInt()获取10就结束了
		 * nextLine()是键盘录入字符串的方法，可以接收任意类型，但是他凭什么能获取一行呢？
		 * 通过\r\n，只要遇到\r\n就结束
		 */
//		System.out.println("请输入第一个整数：");
//		int i =sc.nextInt();
//		System.out.println("请输入第二个字符串");
//		String line2 = sc.nextLine();
//		System.out.println("i="+i+", line2 = "+line2);
		//结果是line2不会被执行
		
		/*
		 * 
		 * 解决方案：
		 * 1，可以通过创建两个对象，但是浪费空间
		 * 2.键盘录入的都是字符串，都用nextLine()方法，然后类型转换
		 */
		int i = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		String line = sc2.nextLine();
		System.out.println(i);
		System.out.println(line);
		
	}

}
 