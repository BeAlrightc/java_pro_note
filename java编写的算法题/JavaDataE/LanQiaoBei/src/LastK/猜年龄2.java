package LastK;

import java.util.HashSet;
import java.util.Set;

public class 猜年龄2 {
	/*
	 * 美国数学家维纳(N.Wiener)智力早熟，11岁就上了大学。他曾在1935~1936年应邀来中国清华大学讲学。

一次，他参加某个重要会议，年轻的脸孔引人注目。于是有人询问他的年龄，他回答说：

“我年龄的立方是个4位数。我年龄的4次方是个6位数。这10个数字正好包含了从0到9这10个数字，每个都恰好出现1次。”

请你推算一下，他当时到底有多年轻。*/

	public static void main(String[] args) {
	for(int i=0;i<=150;i++) {//用一个for循环进行遍历，假设他最大的年龄为150岁
		int a=i*i*i;
		int b=a*i;
		String a1=a+"";//转化为字符串
		String b1=b+"";
		if(a1.length()==4 && b1.length()==6 && check(a1+b1)) {//用check方法判断他们是否为十位数
			System.out.println(i);
			break;
		}
	}
	}

	private static boolean check(String c) {
		Set<Character> c1 = new HashSet<Character>();//建立一个Set集合用于去重
		for(int i=0;i<c.length();i++) {
			c1.add(c.charAt(i));
		}
		return c1.size()==10;
	}

}
