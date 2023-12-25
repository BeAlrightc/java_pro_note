package com.heima.String;

public class Demo2_StringCon {
	/*
	 * public String():空构造
	 * public String(byte[] bytes):把字节数组转成字符串
	 * public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
	 * public String(char[] value)：把字符数组转成字符串
	 * public String (char[] ,int index,int count):把字符数组的一部分转成字符串
	 * public String(String original):把字符串常量转成字符串
	 */

	public static void main(String[] args) {
		String s1 =new String();
		System.out.println(s1);
		
		byte[] arr1 = {97,98,99};
		String s2 = new String(arr1);//解码，将计算机读得懂的转换成我们读的懂
		System.out.println(s2);//打印出abc，对应979899
		
		byte[] arr2 = {97,98,99,100,101,102};
		String s3 = new String(arr2,2,3);//将arr2字节数组从2索引开始转换3个
		System.out.println(s3); 
		
		char[] arr3 = {'a','b','c','d','e'};
		String s4 = new String(arr3);//将字符转换成字符串
		System.out.println(s4);
		
		String s5 = new String(arr3,1,3);//将arr3字节数组从1索引开始转换3个
		System.out.println(s5);
		
		String s6 = new String("heima");
		System.out.println(s6);
	}

}
