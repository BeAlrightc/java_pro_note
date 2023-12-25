package com.heima.test;

public class test2 {
	/**
	 * 案例演示：
	 * 需求：
	 * 遍历字符串
	 * @param args
	 */

	public static void main(String[] args) {
		String s ="heima";
		for(int i=0;i<s.length();i++) {//通过for循环获取每个字符的索引
			char c =s.charAt(i);
			System.out.println(c);
		}
	}

}
