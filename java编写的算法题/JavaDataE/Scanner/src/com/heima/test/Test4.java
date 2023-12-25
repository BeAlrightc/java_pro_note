package com.heima.test;

public class Test4 {
	/*
	 * A：案例需求】
	 * 
	 * 需求：把一个字符串的首字母转成大写，其余的为小写。（只考虑英文大小写字符）
	 */

	public static void main(String[] args) {
		String s="weAreYoung";
		String s2 = s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
		System.out.println(s2);

	}

}
