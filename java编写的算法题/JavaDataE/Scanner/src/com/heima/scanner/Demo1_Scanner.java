package com.heima.scanner;

import java.util.Scanner;

public class Demo1_Scanner {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);//键盘录入
		//int i = sc.nextInt();//从键盘上输入一个整数存储在变量当中
		//System.out.println(i);
	
	if(sc.hasNextInt()) {
		int i =sc.nextInt();
		System.out.println(i);
	}else {
		System.out.println("输入的类型有错误，请重新输入");
	}
	
	}

}
