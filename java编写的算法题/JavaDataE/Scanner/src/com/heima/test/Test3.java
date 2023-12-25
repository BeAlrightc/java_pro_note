package com.heima.test;

public class Test3 {
	/*
	 * A:案例演示:
	 * 需求：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数，其他字符出现的次数
	 * ABCDEFabcd123456!@#$%^
	 * 分析：
	 * 字符串是由字符组成的，而字符的值都是有范围的，通过范围判断是否有该字符，有的话
	 * 就让计数器变量自增
	 */

	public static void main(String[] args) {
		String s ="ABCDEFabcd123456!@#$%^";
		int big =0;
		int small =0;
		int number =0;
		int other  =0;
		//1.获取每一个字符，通过for循环遍历
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);//通过索引获取每一个字符
			//2.判断字符是否·在这个范围之内
			if(c>='A'&& c<='Z') {
				big++;//满足条件就领计数器自增
			}else if(c>='a' && c<='z') {
				small++;
			}else if(c>='0' && c<='9') {
				number++;
			}else {
				other++;
			}
		}
		//打印每一个计数器的结果
		System.out.println(s+"中大写字母有："+big+"个，小写字母有："+small+"个，数字有："+number+"个，其他字符有："+other+"个");
	}

}
