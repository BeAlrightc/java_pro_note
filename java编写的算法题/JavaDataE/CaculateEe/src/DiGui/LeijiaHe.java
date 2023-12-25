package DiGui;

public class LeijiaHe {
	/*
	 * 注意事项：
	 * 1、递归方法必须有出口
	 * 2、每次递归调用必须缩小范围，只有这样才能达到出口条件
	 */

	public static void main(String[] args) {
		int n = sum(11,100);
		int m = sum_recursion(1,10);
		int j = JieChe(1,5);
		
		System.out.println(j);
	}
	
	//先用循环实现累加和
	public static int sum(int start,int end) {
		
		//参数合法性校验
		if(start>=end) {
			return -1;//返回-1执行失败
		}
		//定义一个变量存储累加
		int sum =0;
		//从start到end
		for(int i =start;i<=end;i++) {
			sum +=i;
		}
		return sum;
	}
	
	//递归方法求区间的累加和，本次重点 
	public static int sum_recursion(int start,int end) {
		//递归方法的出口
		if(start==end) {
			return start;
		}
		//递归调用
		//每次递归调用都要缩小范围，目标才能达到出口的条件
		
		return start +sum_recursion(start+1,end);
	}
	//阶乘递归
	public static int JieChe(int start,int end) {
		//设置好出口
		if(start==end) {
			return start;
		}
		return start* JieChe(start+1,end);
	}

}
