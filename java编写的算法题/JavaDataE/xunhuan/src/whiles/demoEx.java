package whiles;

public class demoEx {
	/*
	 * A:求和思想
	 * 求1-100之和
	 * B：统计思想
	 *   统计“水仙花数”一共有多少个
	 */

	public static void main(String[] args) {
//		demo1();
		//统计水仙花数
		int count =0;
		int i=100;
		while(i<=999) {
			int g=i%10;
			int shi=i/10%10;
			int bai =i/100;
			if(i==g*g*g+shi*shi*shi+bai*bai*bai) {
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println(count);
		
	}

	private static void demo1() {//用于求和的方法
		int sum =0;
		int i=1;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}

}
