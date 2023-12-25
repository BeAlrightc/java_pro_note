package com.heima.String;

public class Demo7_StringMethod {
	/*
	 * A:String 的替换功能及案例演示
	 *  String replace(char old,char new)
	 *  String replace(String old ,String new)
	 *  B:String的去除字符串两空格及案例演示
	 *  String trim()
	 *  C:String 的按字典顺序比较两个字符串及案例演示
	 *  int compareTo(String str)
	 *  int compareToIgnoreCase(String str)
	 */

	public static void main(String[] args) {
	//德莫();
	//demo2();
	String s1 = "abc";
	String s2 = "abc";
	int num = s1.compareTo(s2); //按照码表值
	System.out.println(num);
	
	String s3 ="黑";
	String s4 = "马";
	int num2 = s3.compareTo(s4);//查找的时unicode码表值
	System.out.println('黑'+ 0);
	System.out.println('马'+ 0);
	System.out.println(num2);
	String s5 ="heima";
	String s6 = "HEIMA";
	int  num3 = s5.compareTo(s6);
	System.out.println(num3);
	int num4 = s5.compareToIgnoreCase(s6);//不区分大小写
	System.out.println(num4);
	}

	private static void demo2() {
		String s = "  hei   ma   ";
		String s2 =s.trim();//去除两端的空格
		System.out.println(s2);
	}

	private static void 德莫() {
		String s ="heima";
		String s2 =s.replace('i','o');
		System.out.println(s2);
		
		String s3 =s.replace('z', 'o');//不存在就保留原字符，不改变
		System.out.println(s3);
		String s4 = s.replace("ei", "ao");//替换字符串
		System.out.println(s4);
	}

}
