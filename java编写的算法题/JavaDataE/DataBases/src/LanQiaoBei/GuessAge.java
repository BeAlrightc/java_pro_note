package LanQiaoBei;

import java.util.HashSet;
import java.util.Set;

public class GuessAge {
	//本题是，一个人的年龄的三次方是一个四位数，他的四次方是一个六位数。这10个数字包含了0-9所有的数字，求他的年龄

	public static void main(String[] args) {
		for(int i =0;i<100;i++) {
			int i1 =i*i*i;//定义一个变量说明三次方
			int i2 =i1*i;//定义一个变量说明四次方
			//将两个变量转化为字符串
			String s1 =i1+"";
			String s2 =i2+"";
			//加上条件
			if(s1.length() ==4&&s2.length()==6&&check(s1+s2)) {
				System.out.println(i);
				break;
			}
		}

	}
	private static boolean check(String s) {
		//建立一个集合，用于去重
		Set<Character> set =new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			//把字符串
			set.add(s.charAt(i));
		}
		return set.size()==10;
	}

}
