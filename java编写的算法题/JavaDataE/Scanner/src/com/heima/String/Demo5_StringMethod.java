package com.heima.String;

public class Demo5_StringMethod {
	/*
	 * int length():��ȡ�ַ����ĳ���
	 * char charAt(int index)����ȡָ������λ�õ��ַ�
	 * int indexof(int ch):����ָ���ַ� �ڴ��ַ����е�һ�γ��ֵ�����
	 * int indexof(String str):����ָ���ַ����ڴ��ַ����е�һ�γ��ִ�������
	 * int indexof(int ch,int fromIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ֳ���������
	 * int indexof(String str,int fromIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ֳ�������
	 * lastIndex
	 * String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ�����Ĭ�ϵ�ĩβ��
	 * String substring(int start,int end):��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ���
	 */

	public static void main(String[] args) {
		//demo2();
		//demo3();
//		demo();	
		//demo4();
	String s ="woaiheima";
	s.substring(4);  //substring�����һ���µ��ַ�������Ҫ���µ��ַ�����¼
	System.out.println(s);//��ӡ��ԭ���� woaiheima;ǧ���嶯
	}

	private static void demo4() {
		String s1 = "heimaloser";
		String s2 =s1.substring(5);//��ָ��λ�ÿ�ʼ��ȡ��ĩβ
		System.out.println(s2);
		String s3 = s1.substring(0,5);//����ͷ������β
		System.out.println(s3);
	}

	private static void demo() {
		String s1 ="woaiheima";
		int index1 = s1.indexOf('a',3);//��ָ��λ�������
		System.out.println(index1);
		int index2 = s1.lastIndexOf('a');//�Ӻ���ǰ�ң���һ�γ��ֵ�λ��
		System.out.println(index2);
		int index3 = s1.lastIndexOf('a',7);//��ָ��λ����ǰ��
		System.out.println(index3);
	}

	private static void demo3() {
		String s1 = "heima";
		int index =s1.indexOf('a');//����int���͵Ĵ���char���͵Ļ��Զ�����
		System.out.println(index);
		int index2 = s1.indexOf('z');
		System.out.println(index2);	//��������ھͷ���-1	
		int index3 = s1.indexOf("ma");//��ȡ�ַ�����һ���ַ����ֵ�λ��
		System.out.println(index3);
		int index4 =s1.indexOf("ia");
		System.out.println(index4);//���������ŵ�
	}

	private static void demo2() {
		//		int [] arr= {11,22,33};
		//		System.out.println(arr.length);//�������ṩlength����
				String s1= "heima";
				String s2 ="�Ұ���ѧУ��";
				System.out.println(s2.length());//����ַ����ĳ��ȣ���length()Ϊһ����������ȡ�ַ���ÿһ���ַ��ĸ���
				
				char c =s2.charAt(3);
				System.out.println(c);//�����������ַ������ַ���ע��Խ������
	}

}
