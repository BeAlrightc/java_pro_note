package com.heima.String;

public class Demo7_StringMethod {
	/*
	 * A:String ���滻���ܼ�������ʾ
	 *  String replace(char old,char new)
	 *  String replace(String old ,String new)
	 *  B:String��ȥ���ַ������ո񼰰�����ʾ
	 *  String trim()
	 *  C:String �İ��ֵ�˳��Ƚ������ַ�����������ʾ
	 *  int compareTo(String str)
	 *  int compareToIgnoreCase(String str)
	 */

	public static void main(String[] args) {
	//��Ī();
	//demo2();
	String s1 = "abc";
	String s2 = "abc";
	int num = s1.compareTo(s2); //�������ֵ
	System.out.println(num);
	
	String s3 ="��";
	String s4 = "��";
	int num2 = s3.compareTo(s4);//���ҵ�ʱunicode���ֵ
	System.out.println('��'+ 0);
	System.out.println('��'+ 0);
	System.out.println(num2);
	String s5 ="heima";
	String s6 = "HEIMA";
	int  num3 = s5.compareTo(s6);
	System.out.println(num3);
	int num4 = s5.compareToIgnoreCase(s6);//�����ִ�Сд
	System.out.println(num4);
	}

	private static void demo2() {
		String s = "  hei   ma   ";
		String s2 =s.trim();//ȥ�����˵Ŀո�
		System.out.println(s2);
	}

	private static void ��Ī() {
		String s ="heima";
		String s2 =s.replace('i','o');
		System.out.println(s2);
		
		String s3 =s.replace('z', 'o');//�����ھͱ���ԭ�ַ������ı�
		System.out.println(s3);
		String s4 = s.replace("ei", "ao");//�滻�ַ���
		System.out.println(s4);
	}

}
