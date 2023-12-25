package com.heima.String;

public class Demo5_StringMethod {
	/*
	 * int length():获取字符串的长度
	 * char charAt(int index)：获取指定索引位置的字符
	 * int indexof(int ch):返回指定字符 在此字符串中第一次出现的索引
	 * int indexof(String str):返回指定字符串在此字符串中第一次出现处的索引
	 * int indexof(int ch,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现出的索引。
	 * int indexof(String str,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现出的索引
	 * lastIndex
	 * String substring(int start):从指定位置开始截取字符串，默认到末尾。
	 * String substring(int start,int end):从指定位置开始到指定位置结束截取字符串
	 */

	public static void main(String[] args) {
		//demo2();
		//demo3();
//		demo();	
		//demo4();
	String s ="woaiheima";
	s.substring(4);  //substring会产生一个新的字符串，需要将新的字符串记录
	System.out.println(s);//打印出原来的 woaiheima;千万别冲动
	}

	private static void demo4() {
		String s1 = "heimaloser";
		String s2 =s1.substring(5);//从指定位置开始截取到末尾
		System.out.println(s2);
		String s3 = s1.substring(0,5);//包含头不包含尾
		System.out.println(s3);
	}

	private static void demo() {
		String s1 ="woaiheima";
		int index1 = s1.indexOf('a',3);//从指定位置向后找
		System.out.println(index1);
		int index2 = s1.lastIndexOf('a');//从后向前找，第一次出现的位置
		System.out.println(index2);
		int index3 = s1.lastIndexOf('a',7);//从指定位置向前找
		System.out.println(index3);
	}

	private static void demo3() {
		String s1 = "heima";
		int index =s1.indexOf('a');//参数int类型的传递char类型的会自动提升
		System.out.println(index);
		int index2 = s1.indexOf('z');
		System.out.println(index2);	//如果不存在就返回-1	
		int index3 = s1.indexOf("ma");//获取字符串第一个字符出现的位置
		System.out.println(index3);
		int index4 =s1.indexOf("ia");
		System.out.println(index4);//必须是连着的
	}

	private static void demo2() {
		//		int [] arr= {11,22,33};
		//		System.out.println(arr.length);//数组中提供length属性
				String s1= "heima";
				String s2 ="我爱上学校了";
				System.out.println(s2.length());//求出字符串的长度，且length()为一个方法，获取字符串每一个字符的个数
				
				char c =s2.charAt(3);
				System.out.println(c);//根据索引赵字符串的字符，注意越界问题
	}

}
