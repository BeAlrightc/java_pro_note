package com.heima.scanner;

import java.util.Scanner;

public class Demo1_Scanner {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);//����¼��
		//int i = sc.nextInt();//�Ӽ���������һ�������洢�ڱ�������
		//System.out.println(i);
	
	if(sc.hasNextInt()) {
		int i =sc.nextInt();
		System.out.println(i);
	}else {
		System.out.println("����������д�������������");
	}
	
	}

}
