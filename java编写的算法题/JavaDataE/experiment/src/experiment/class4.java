package experiment;

import java.util.Scanner;

public class class4 {
	private  static int x;
	private  static int y;

	public class4(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//两个数相乘
	public int cheng() {
		return x*y;
	}
	public int chu() {
		return x/y;
	}
	public int jia() {
		return x+y;
	}
	public int jian() {
		return x-y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入x:");
		int x=sc.nextInt();
		System.out.println("请输入y:");
		int y=sc.nextInt();
		class4 c = new class4(x,y);
		int z=c.cheng();
		System.out.println("这两个数的乘积为："+z);

	}

}
