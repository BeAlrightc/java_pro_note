package themes;

import java.util.Scanner;

//判断一个整数的二进制有多少个1
public class JudeHowMany1 {

	public static void main(String[] args) {
		System.out.println("请输入一个整数：");
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println(N+"的二进制数为："+Integer.toString(N,2));
		//way1
		int count =0;
		for(int i=0;i<32;i++) {
			if((N&(1<<i))==(1<<i)) {
				count++;
			}
		}
		System.out.println("该二进制数有"+count+"个1");
		System.out.println("==============");
		
		//way2
		count=0;
		while(N!=0) {
			N=(N-1)&N;//原数-1在和原数做与运算可以消除1
			count++;
		}
		System.out.println("该二进制数有"+count+"个1");
		
		
	}

}
