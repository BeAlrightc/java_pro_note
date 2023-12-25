package themes2;

import java.util.Scanner;

public class 求和 {
	/*
	 * 小明对数位中含有 2、0、1、9 的数字很感兴趣，
	 * 在 1 到 40 中这样的数包 括 1、2、9、10 至 32、39 和 40，
	 * 共 28 个，他们的和是 574。 请问，在 1 到 2019 中，所有这样的数的和是多少？
	 */

	public static void main(String[] args) {
		System.out.println("请输入相应的数字");
		Scanner cs = new Scanner(System.in);
		int n = cs.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			String temp =i+"";
			if(temp.contains("2")||temp.contains("0")||temp.contains("1")||temp.contains("9")) {
				sum +=i;
			}
		}
         System.out.println(sum);
	}

}
