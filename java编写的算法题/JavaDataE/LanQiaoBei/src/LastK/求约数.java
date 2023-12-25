package LastK;

public class 求约数 {
	/*
	 * 求78120有多少个约数
	 */

	public static void main(String[] args) {
		int count=0;
		int a=78120;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {//看a是否能够整除另一个数，如果可以就属于a的约数
				count++;
			}
		}
		System.out.println(count);

	}

}
