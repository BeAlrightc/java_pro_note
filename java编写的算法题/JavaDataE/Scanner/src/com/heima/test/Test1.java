package com.heima.test;

import java.util.Scanner;

public class Test1 {
	/*
	 * A:������ʾ
	 * ����
	 * �û��������붼��admin
	 * ������
	 * 1��ģ���½����Ҫ����¼�룬Scanner
	 * 2�������λ��ᣬ��Ҫѭ��for
	 * 3������ʾ�м��Σ���Ҫ�жϡ�if
	 *
	 */

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);//��������¼�����
		for(int i=0;i<3;i++) {
			
		System.out.println("�������û�����");
		String username =sc.nextLine();//������¼����û������洢��username��
		System.out.println("���������룺");
		String password =sc.nextLine();//������¼������룬�洢��username��
		String d ="admin";
		//������ַ����������ַ��������Ƚϣ�ͨ�������ַ����������÷����������������������ݣ���ֹ��ָ���쳣
		if(d.equals(username) && d.equals(password)) {
			System.out.println("��ӭ"+username+"��¼");
			break;//����ѭ��
		}else {
			if(i == 2) {
				System.out.println("���Ĵ�������ѵ���������������");
			}
			System.out.println("¼�����������"+(2-i)+"�λ���");
			
			
		 }
		}
	}
		
}
