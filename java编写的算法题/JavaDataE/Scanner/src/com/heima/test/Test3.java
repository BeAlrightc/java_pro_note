package com.heima.test;

public class Test3 {
	/*
	 * A:������ʾ:
	 * ����ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ����������ַ����ֵĴ���
	 * ABCDEFabcd123456!@#$%^
	 * ������
	 * �ַ��������ַ���ɵģ����ַ���ֵ�����з�Χ�ģ�ͨ����Χ�ж��Ƿ��и��ַ����еĻ�
	 * ���ü�������������
	 */

	public static void main(String[] args) {
		String s ="ABCDEFabcd123456!@#$%^";
		int big =0;
		int small =0;
		int number =0;
		int other  =0;
		//1.��ȡÿһ���ַ���ͨ��forѭ������
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);//ͨ��������ȡÿһ���ַ�
			//2.�ж��ַ��Ƿ��������Χ֮��
			if(c>='A'&& c<='Z') {
				big++;//���������������������
			}else if(c>='a' && c<='z') {
				small++;
			}else if(c>='0' && c<='9') {
				number++;
			}else {
				other++;
			}
		}
		//��ӡÿһ���������Ľ��
		System.out.println(s+"�д�д��ĸ�У�"+big+"����Сд��ĸ�У�"+small+"���������У�"+number+"���������ַ��У�"+other+"��");
	}

}
