package com.heima.String;

import com.heima.bean.Person;

public class Demo6_StringMethod {
	/*
	 * byte[] getBytes():���ַ���ת��Ϊ�ֽ�����
	 * char[] toCharArray():���ַ���ת�����ֽ�����
	 * static String valueof(char[] chs);���ַ�����ת���ַ���
	 * static string vaslueof(int i):��int���͵�����ת���ַ���
	 *  ע�⣺String ���valueof()�������Խ��������͵�����ת���ַ���
	 *  
	 *   String toLowerCase():���ַ���ת��Сд��
	 *   String toUpperCase():���ַ���ת�ɴ�д
	 *   String concat(String str):���ַ���ƴ������
	 */

	public static void main(String[] args) {
		//demo();
		//demo2();
		//demo3();
		String s1 ="heimaMA";
		String s2 ="chengxuYUAN";
		String s3 =s1.toLowerCase();
		String s4 = s2.toUpperCase();
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3+s4);//��+��ƴ���ַ�����ǿ�󣬿�������������ƴ�ӳ��ַ���
		System.out.println(s3.concat(s4));//���ַ���ƴ��
		
	}

	private static void demo3() {
		char [] arr = {'a','b','c'};
		String s =String.valueOf(arr);//�ײ���String�๹�췽����ɵ�
		System.out.println(s);
		
		String s2 = String.valueOf(100);//��100ת��Ϊ�ַ���
		System.out.println(s2+100);
		
		Person p1 = new Person("����",23);
		System.out.println(p1);
		String s3 =String.valueOf(p1);//���õ��Ƕ����toString()����
		System.out.println(s3);
	}

	private static void demo2() {
		String s = "heima";
		char[] arr = s.toCharArray();//���ַ���ת�����ַ�����
	
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void demo() {
		String s1 = "abc";
		byte[] arr =s1.getBytes();
		for(int i=0;i<arr.length;i++) {
			//System.out.print(arr[i]+" ");
		}
		String s2 ="������";
		byte[] arr2 =s2.getBytes();//ͨ��gbk���ת��Ϊ�ֽ�����
		for(int i=0;i<arr2.length;i++) {//������̣������Ƕ���ת��Ϊ���������
			System.out.print(arr2[i]+" ");//���ָ�����gnk���һ�����Ĵ��������ֽ�
		}					//gbk�����ص㣬���ĵĵ�һ���ֽڿ϶��Ǹ���
	}

}
