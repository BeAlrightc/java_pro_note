package Themes;

public class 求约数 {
	/*
	 * 求78120有多少个约数
	 */

	public static void main(String[] args) {
		int ans=0;
		for(int i=1;i<=78120;i++) {
			if(78120%i==0) {
				ans++;
			}
			
		}
		System.out.println(ans);

	}

}
