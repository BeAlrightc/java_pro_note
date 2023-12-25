package LanQiaoBei;

import java.util.HashSet;
import java.util.Set;

public class Coage {

	public static void main(String[] args) {
		for(int i =10; i<100;i++) {
			int i1 = i*i*i;
			int i2 = i1*i;
			String s1= i1+"";//将int型转化为字符串格式
			String s2 = i2+"";
			
			if(s1.length()==4&&s2.length()==6&&check(s1+s2)) {
				System.out.println(i);
			 break;
			}
		}
	}
		public static boolean check(String s) {
			Set<Character> set =new HashSet<Character>();//hashset具有去重复的的功能
			for(int i =0;i<s.length();i++) {//将s里的字符依次装进set容器当中。
				set.add(s.charAt(i));//charAt（）函数是将字符串的每个字符扣出来
			}
			return set.size()==10;//判断这个集合对象的长度是不是等于10个返回一个true/false的值
		

	}

}
