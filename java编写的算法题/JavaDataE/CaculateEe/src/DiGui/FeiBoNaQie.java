package DiGui;
//斐波那契额数列
public class FeiBoNaQie {

	public static void main(String[] args) {
//		feiBO(8);
		FeiBOd(1);

	}
	
	//递归方法实现斐波纳妾数列
	/*
	 * 分析调用方法
	 * 1、出口
	 * 控制输出数列数据的个数作为出口条件
	 * 设一个变量为index表示序号，从1开始，每次递归调用让index自增1，当index大于数列的总数时达到出口(终止递归调用)
	 * 
	 * 2、每次递归i调用必须缩小范围
	 * 还可以控制数列的数据个数入手，每次调用序号的值都自增1，序列和数列的总数之间为0、1、1、2
	 * 
	 */
	//为方便使用，定义以下方法,此方法为公开方法
	
	public static void FeiBOd(int num) {
		//合法性校验
		if(num<1) {
			return ;//执行失败，return ;后边之家一个;号就终止方法执行
		}else {
			//调用递归方法
			FeiBOdd(1,num,0,1);
		}
		
	}
	
	
	//由于递归方法不利于用户的使用，定义为私有
	/*
	 * index 数据的序号
	 * num 数列数据的个数
	 * one 第一个数
	 * two 第二个数	 
	 * */
	private static void FeiBOdd(int index,int num,int one,int two) {
		
		//出口,当数据的序号大于数据的个数的时候，停止调用，递归终结
		if(index>num) {
			return ;
		}
		if(index ==1) {
		System.out.println(0);	
		System.out.println(1);	
		}
		//第三个数为前两个数之和
		System.out.println(one+two);
		//原来第二个数变成第一个数
		FeiBOdd(++index,num,two,one+two);
	}
	
	
	
	//循环方法实现斐波那契数列
	//num为输出的斐波那契额的个数，当num为1的时候输出的数列为0、1、1，
	//当num为2的时候输出的数列为0、1、1、2
public static void feiBO(int num) {
	//合法性校验
	if(num<1) {
		return ;//执行失败，return ;后边之家一个;号就终止方法执行
	}
	//设一个变量标记输出数据的个数
	int n =0;
	
	//第一个数
	int a =0;
	
	//第二个数
	int b =1;
	
	//第三个数为两个数之和
	int c =0;
	
	do {
		n++;
		if(n==1) {
			System.out.println(0);
			System.out.println(1);
		}
		//第三个数为前两个数之和
		c =a+b;
		System.out.println(c);
		//原来的第二个数为第一个数，
		a=b;
		//原来的第三个数变为第二个数
		b=c;
	}while(n<num);
 }

	
}
