package ControlandTrans;

import java.util.Scanner;

public class 求质数 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int A =sc.nextInt();
		int res =0;
		int ans = 0;
		while(ans<=A) {
			res++;//加1
			if(check(res)) {
				ans++;
			}
		}
		System.out.println(res);

	}

	private static boolean check(int res) {
		int flag=0;//设置标志
		for(int i=2;i<res;i++) {
			if(res%i==0) {
				 flag=1;
			}
		}
		if(flag==1) {
			return false;
		}else {
			return true;
		}
	}

}
