package com.heima.String;

public class Demo3_String {

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 ="abc";//在常量池的地址
		String s3 = s1+"c";//在堆内存的地址
		System.out.println(s3==s2);//false,
		System.out.println(s3.equals(s2));//true

	}
	private static void demo1() {//常量池中没有字符串对象，就创建一个，如果有就直接用
		String s1 ="abc";
		String s2 ="abc";
		System.out.println(s1==s2);//true比较对象是否相同
		System.out.println(s1.equals(s2));//true，比较里面的值是否相同
	}
	
	private static void demo2() {
		//创建几个对象
		//创建两个对象，一个在常量池，一个在堆内存
		String s1 = new String("abc"); 
		System.out.println(s1);
	}

	private static void demo3() {
		String s1 = new String("abc");//记录堆存的地址
		String s2 = "abc";//记录常量池的地址
		System.out.println(s1==s2);//两个不同的对象，false
		System.out.println(s1.equals(s2));//值相同，true
	}
	private static void demo4() {
		//byte b= 3+4;由于java的常量优化机制，因此在编译时就将7赋给了b
		String s1 ="a"+"b"+"c";//在编译时将"abc"赋给了s1
		String s2 ="abc";
		System.out.println(s1==s2);//true ？java中有常量优化机制
		System.out.println(s1.equals(s2));//true值一定相同
	}
}
