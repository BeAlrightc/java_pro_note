package themes3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 不同子串 {
	/*
	 * 一个字符串的非空子串是指字符串中长度至少为 1 的连续的一段字符组成 的串。
	 * 例如，字符串aaab 有非空子串a, b, aa, ab, aaa, aab, aaab，一共 7 个。
	 *  注意在计算时，只算本质不同的串的个数。 请问，字符串0100110001010001 有多少个不同的非空子串？
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr =sc.next();
		Set<String> set =new HashSet<String>();
		for(int i =0;i<arr.length();i++) {
			//以i为开头的所有可能结果所以j必须大于i
			for(int j=i+1;j<=arr.length();j++) {
				//虽然substring 下标i~j的时候是不包含j的
				//每个数字开头本身也是一个非空子串，也符合题意
				//所以不需要变成substring(i,j+1),
				//由于需要包含到最后一个字符所以j最大值为arr.length();
				String temp = arr.substring(i,j);//字符串切割
				set.add(temp);//加入集合中进行去重
			}
		}
		System.out.println(set.size());

	}

}
