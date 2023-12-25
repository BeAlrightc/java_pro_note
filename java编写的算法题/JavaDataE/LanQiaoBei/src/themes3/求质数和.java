package themes3;

import java.util.Scanner;

public class 求质数和 {//还需要多看看
	/*
	 * 我们知道第一个质数是 2、第二个质数是
	 *  3、第三个质数是 5……
	 *  请你计算 第 2019 个质数是多少？
	 */

	public static void main(String[] args) {
		System.out.println("请输入质数个数：");
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int ans=0;//用于记录第几个质数
		int res=0;//用于记录该质数的值
		while(ans<=A) {
			res++;//慢慢遍历向后加(先加一)
			if(check(res)) {//如果通过检查
				ans++;//个数加一
			}
		}
     System.out.println(res);
	}

	private static boolean check(int nums) {//此方法用于检查是否为质数
		int flag=0;//设置标志
		for(int i=2;i<nums;i++) {//这隐含一个条件i<nums i不可以等于2
			if(nums%i==0) {
				flag=1;//设置为标志
				break;
			}
		}
		if(flag==1) {//如果标志为1
			return false;//返回错
		}else {
			return true;//返回对
		}
		
	}

}
