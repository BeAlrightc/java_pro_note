package com.heima.test;

import java.util.Scanner;

public class Test6 {
	/*
	 * A:������ʾ��
	 * ���󣺰��ַ�����ת
	 * �������������룺"abc";
	 * �����"cba";
	 * ������
	 * 1��ͨ������¼���ȡ�ַ���
	 * 2���ַ���ת��Ϊ�ַ�����
	 * 3�����ű����ַ����飬Ȼ���ٴ�ƴ��
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String line=sc.nextLine();
		
		char [] arr =line.toCharArray();//���ַ���ת��Ϊ����
		String s ="";
		for(int i =arr.length-1;i>=0;i--) {//���ű����ַ�����
			s=s+arr[i];
		}
		System.out.println(s);
		
	}

}
