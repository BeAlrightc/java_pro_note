package com.heima.test;

import java.util.Scanner;

public class Test6 {
	/*
	 * A:案例演示：
	 * 需求：把字符串反转
	 * 举例：键盘输入："abc";
	 * 输出："cba";
	 * 分析：
	 * 1、通过键盘录入获取字符串
	 * 2将字符串转换为字符数组
	 * 3、倒着遍历字符数组，然后再次拼接
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line=sc.nextLine();
		
		char [] arr =line.toCharArray();//将字符串转化为数组
		String s ="";
		for(int i =arr.length-1;i>=0;i--) {//倒着遍历字符数组
			s=s+arr[i];
		}
		System.out.println(s);
		
	}

}
