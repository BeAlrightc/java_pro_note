package com.heima.String;

public class Demo4_StringMethod {
	/*
	 *常见的String类方法：
	 *boolean equals(Object obj):比较字符串的内容是否相同，区分大小写
	 * boolean equalsIgnoreCase(String str):比较字符串的内容是否相同，忽略大小写
	 * boolean contains(String str):判断大字符串是否包含小字符串
	 * boolean startsWith(String str):判断字符串中是否以某个指定的字符串开头
	 * boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾
	 * boolean isempty():判断字符串是否为空
	 * 
	 * "" 和null的区别
	 * "" 是字符串常量，同时也是String的对象，既然是对象，当然可以调用string类的方法
	 * null是空常量，不能调用任何的方法，否则会出现空指针异常，null常量可以给任意的引用数据类型赋值
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
		String s1 ="我爱heima,哈哈";
		String s2 ="heima";
		String s3 ="baima";
		String s4 ="我爱";
		String s5 ="哈哈";
		
		
		System.out.println(s1.contains(s2));//判断是否包含传入的字符串true
		System.out.println(s1.contains(s3));//false
		System.out.println("====================");
		System.out.println(s1.startsWith(s4));//true,判断是否与传入的字符串开头
		System.out.println(s1.startsWith(s5));//false
		System.out.println("=====================");
		System.out.println(s1.endsWith(s4));//false,判断是否与传入的字符串结尾
		System.out.println(s1.endsWith(s5));//true
	}

	private static void demo1() {
		String s1 ="heima";
		String s2 ="heima";
		String s3 ="Heima";
		System.out.println(s1.equals(s2));//严格区分大小写true
		System.out.println(s2.equals(s3));//false
		System.out.println(s1.equalsIgnoreCase(s2));//不区分大小写都为true
		System.out.println(s2.equalsIgnoreCase(s3));//true
	}

}
