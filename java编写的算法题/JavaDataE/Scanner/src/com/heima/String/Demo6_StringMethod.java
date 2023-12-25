package com.heima.String;

import com.heima.bean.Person;

public class Demo6_StringMethod {
	/*
	 * byte[] getBytes():把字符串转换为字节数组
	 * char[] toCharArray():把字符串转换到字节数组
	 * static String valueof(char[] chs);把字符数组转成字符串
	 * static string vaslueof(int i):把int类型的数据转成字符串
	 *  注意：String 类的valueof()方法可以将任意类型的数据转成字符串
	 *  
	 *   String toLowerCase():把字符串转成小写，
	 *   String toUpperCase():把字符串转成大写
	 *   String concat(String str):把字符串拼接起来
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
		System.out.println(s3+s4);//用+号拼接字符串更强大，可以与任意类型拼接成字符串
		System.out.println(s3.concat(s4));//把字符串拼接
		
	}

	private static void demo3() {
		char [] arr = {'a','b','c'};
		String s =String.valueOf(arr);//底层是String类构造方法完成的
		System.out.println(s);
		
		String s2 = String.valueOf(100);//将100转化为字符串
		System.out.println(s2+100);
		
		Person p1 = new Person("张三",23);
		System.out.println(p1);
		String s3 =String.valueOf(p1);//调用的是对象的toString()方法
		System.out.println(s3);
	}

	private static void demo2() {
		String s = "heima";
		char[] arr = s.toCharArray();//将字符串转换成字符数组
	
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
		String s2 ="你好你好";
		byte[] arr2 =s2.getBytes();//通过gbk码表转换为字节数组
		for(int i=0;i<arr2.length;i++) {//编码过程，将我们懂得转换为计算机懂得
			System.out.print(arr2[i]+" ");//出现负数，gnk码表一个中文代表两个字节
		}					//gbk编码特点，中文的第一个字节肯定是负数
	}

}
