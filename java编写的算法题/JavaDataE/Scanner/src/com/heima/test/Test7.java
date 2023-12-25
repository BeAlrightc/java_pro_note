package com.heima.test;

public class Test7 {
	/*
	 * A:画图演示、
	 * 需求：统计大串中小串出现的次数
	 * 这里的大串和小串可以根据情况给出
	 * 步骤：
	 * 1、定义计数器变量，变量为0
	 * 2、通过indexOf方法在大串找小串，
	 * 	如果没有返回-1程序结束
	 * 如果有返回索引值
	 * 3、根据获取的索引值，截取大串；讲截取后的结果给大串
	 */

	public static void main(String[] args) {
		//定义大串
		String max ="woaiheima,heimabutongyubaima,wulunheimahaishibai,zhaodaogongzuojiushaoma";
		//定义小串
		String min ="heima";
		//统计heima出现的次数
		
		//定义计数器变量
		int count =0;
		//定义索引
		int index =0;
		//定义循环，判断小串是否在大串中出现
		while((index =max.indexOf(min)) !=-1) {
			count++;//计数器自增
			//重新定义位置索引，从出现min的第一个字符串开始加上min的长度到末尾位置
			max =max.substring(index + min.length());
		}
		System.out.println(count);
	}

}
