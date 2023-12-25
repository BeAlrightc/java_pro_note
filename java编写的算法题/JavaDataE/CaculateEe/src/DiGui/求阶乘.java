package DiGui;

public class 求阶乘 {

	public static void main(String[] args) {
		int y = Jie(5);
		System.out.println(y);

	}
	/*
	 * 找重复
	 * n*(n-1)的阶乘，是原问题的重复，不同在于规模更小
	 */
	public static int Jie(int n) {
		//设置终止条件
		if(n==1) {
			//当n为1的时候返回1
			return 1;
		}
		return n*Jie(n-1);//反复调用自身
	}

}
