package com.heima.scanner;

import java.util.Scanner;

public class Demo2_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("�������һ��������");
//		int i = sc.nextInt();
//		System.out.println("������ڶ�������");
//		int j = sc.nextInt();
//		System.out.println("i ="+i+",j="+j);
		
		
//		System.out.println("�������һ���ַ�����");
//		String line1 =sc.nextLine();
//		System.out.println("������ڶ����ַ�����");
//		String line2 = sc.nextLine();
//		System.out.println("line1 = "+line1+",line2= "+line2);
		/*
		 * 
		 * nextInt()�Ǽ���¼�������ķ�����������¼��23��ʱ��
		 * ��ʵ���ڼ�����¼�����23��\r\n,nextInt()��ȡ10�ͽ�����
		 * nextLine()�Ǽ���¼���ַ����ķ��������Խ����������ͣ�������ƾʲô�ܻ�ȡһ���أ�
		 * ͨ��\r\n��ֻҪ����\r\n�ͽ���
		 */
//		System.out.println("�������һ��������");
//		int i =sc.nextInt();
//		System.out.println("������ڶ����ַ���");
//		String line2 = sc.nextLine();
//		System.out.println("i="+i+", line2 = "+line2);
		//�����line2���ᱻִ��
		
		/*
		 * 
		 * ���������
		 * 1������ͨ�������������󣬵����˷ѿռ�
		 * 2.����¼��Ķ����ַ���������nextLine()������Ȼ������ת��
		 */
		int i = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		String line = sc2.nextLine();
		System.out.println(i);
		System.out.println(line);
		
	}

}
 