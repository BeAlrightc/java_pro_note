package com.heima.String;

public class Demo3_String {

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 ="abc";//�ڳ����صĵ�ַ
		String s3 = s1+"c";//�ڶ��ڴ�ĵ�ַ
		System.out.println(s3==s2);//false,
		System.out.println(s3.equals(s2));//true

	}
	private static void demo1() {//��������û���ַ������󣬾ʹ���һ��������о�ֱ����
		String s1 ="abc";
		String s2 ="abc";
		System.out.println(s1==s2);//true�Ƚ϶����Ƿ���ͬ
		System.out.println(s1.equals(s2));//true���Ƚ������ֵ�Ƿ���ͬ
	}
	
	private static void demo2() {
		//������������
		//������������һ���ڳ����أ�һ���ڶ��ڴ�
		String s1 = new String("abc"); 
		System.out.println(s1);
	}

	private static void demo3() {
		String s1 = new String("abc");//��¼�Ѵ�ĵ�ַ
		String s2 = "abc";//��¼�����صĵ�ַ
		System.out.println(s1==s2);//������ͬ�Ķ���false
		System.out.println(s1.equals(s2));//ֵ��ͬ��true
	}
	private static void demo4() {
		//byte b= 3+4;����java�ĳ����Ż����ƣ�����ڱ���ʱ�ͽ�7������b
		String s1 ="a"+"b"+"c";//�ڱ���ʱ��"abc"������s1
		String s2 ="abc";
		System.out.println(s1==s2);//true ��java���г����Ż�����
		System.out.println(s1.equals(s2));//trueֵһ����ͬ
	}
}
