package com.heima.test;

public class Test7 {
	/*
	 * A:��ͼ��ʾ��
	 * ����ͳ�ƴ���С�����ֵĴ���
	 * ����Ĵ󴮺�С�����Ը����������
	 * ���裺
	 * 1���������������������Ϊ0
	 * 2��ͨ��indexOf�����ڴ���С����
	 * 	���û�з���-1�������
	 * ����з�������ֵ
	 * 3�����ݻ�ȡ������ֵ����ȡ�󴮣�����ȡ��Ľ������
	 */

	public static void main(String[] args) {
		//�����
		String max ="woaiheima,heimabutongyubaima,wulunheimahaishibai,zhaodaogongzuojiushaoma";
		//����С��
		String min ="heima";
		//ͳ��heima���ֵĴ���
		
		//�������������
		int count =0;
		//��������
		int index =0;
		//����ѭ�����ж�С���Ƿ��ڴ��г���
		while((index =max.indexOf(min)) !=-1) {
			count++;//����������
			//���¶���λ���������ӳ���min�ĵ�һ���ַ�����ʼ����min�ĳ��ȵ�ĩβλ��
			max =max.substring(index + min.length());
		}
		System.out.println(count);
	}

}
