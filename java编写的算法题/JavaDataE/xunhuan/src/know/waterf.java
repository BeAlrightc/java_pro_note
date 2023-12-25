package know;

public class waterf {
	/*
	 * A:案例演示：
	 * 需求：在控制台输出所有的"水仙花数"
	 * 
	 * 所谓水仙花就是指一个三位数，其各位数字的立方和等于该数本身
	 * 举例：153就是一个水仙花1数
	 * 153 =1*1*1 + 5*5*5 +3*3*3 = 1+125+27 = 153
	 * 
	 * 
	 * 分析100-999,将在这个范围里面的水仙花数都输出来并统计水仙花的数量！
	 */

	public static void main(String[] args) {
		int g = 0;
		for(int i=100;i<=999;i++) {//指定范围
			int a =i/100;//百位
			int b =i/10%10;//十位
			int c= i%10;//个位
			if(i==a*a*a+b*b*b+c*c*c) {//满足水仙花的数据条件
				g++;//数量加1
				System.out.println(i);//输出水仙花数
			}
		}
		System.out.println(g);//输出水仙花的数量

	}

}
