package themes3;

public class 无穷分数 {
	/*
	 * 无穷的分数，有时会趋向于固定的数字。

请计算，要求四舍五入，精确到小数点后5位，小数位不足的补0。

请填写该浮点数，不能填写任何多余的内容。
	 */

	public static void main(String[] args) {
		System.out.printf("%.5f",F(1));

	}

	private static double F(double n) {
		if(n>=100) {//出口可以自己设定，应为后面的数都会慢慢趋于一个更精确的数字
			return n;
		}else {
			return n/(n+F(n+1));//仔细观察图片，找到式子规律
		}
	}
}
