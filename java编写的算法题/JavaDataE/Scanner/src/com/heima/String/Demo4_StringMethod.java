package com.heima.String;

public class Demo4_StringMethod {
	/*
	 *������String�෽����
	 *boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ�����ִ�Сд
	 * boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ�����Դ�Сд
	 * boolean contains(String str):�жϴ��ַ����Ƿ����С�ַ���
	 * boolean startsWith(String str):�ж��ַ������Ƿ���ĳ��ָ�����ַ�����ͷ
	 * boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β
	 * boolean isempty():�ж��ַ����Ƿ�Ϊ��
	 * 
	 * "" ��null������
	 * "" ���ַ���������ͬʱҲ��String�Ķ��󣬼�Ȼ�Ƕ��󣬵�Ȼ���Ե���string��ķ���
	 * null�ǿճ��������ܵ����κεķ������������ֿ�ָ���쳣��null�������Ը�����������������͸�ֵ
	 */

	public static void main(String[] args) {
		//demo1();
		//demo2();
		String s1 ="heima";
		String s2 = "";
		String s3 =null;
		System.out.println(s1.isEmpty());//false
		System.out.println(s2.isEmpty());//true
		System.out.println(s3.isEmpty());//false
	}

	private static void demo2() {
		String s1 ="�Ұ�heima,����";
		String s2 ="heima";
		String s3 ="baima";
		String s4 ="�Ұ�";
		String s5 ="����";
		
		
		System.out.println(s1.contains(s2));//�ж��Ƿ����������ַ���true
		System.out.println(s1.contains(s3));//false
		System.out.println("====================");
		System.out.println(s1.startsWith(s4));//true,�ж��Ƿ��봫����ַ�����ͷ
		System.out.println(s1.startsWith(s5));//false
		System.out.println("=====================");
		System.out.println(s1.endsWith(s4));//false,�ж��Ƿ��봫����ַ�����β
		System.out.println(s1.endsWith(s5));//true
	}

	private static void demo1() {
		String s1 ="heima";
		String s2 ="heima";
		String s3 ="Heima";
		System.out.println(s1.equals(s2));//�ϸ����ִ�Сдtrue
		System.out.println(s2.equals(s3));//false
		System.out.println(s1.equalsIgnoreCase(s2));//�����ִ�Сд��Ϊtrue
		System.out.println(s2.equalsIgnoreCase(s3));//true
	}

}
