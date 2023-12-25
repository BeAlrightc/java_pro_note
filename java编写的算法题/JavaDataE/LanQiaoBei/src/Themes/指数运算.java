package Themes;

import java.math.BigInteger;

public class 指数运算 {
	//请计算：7 ^ 2020 mod 1921，其中 A mod B 表示 A 除以 B 的余数。

	public static void main(String[] args) {
//		demo1();
		//这种方法是采用大数类BigInteger来进行计算的
		BigInteger s = new BigInteger("7");
	      System.out.println( s.pow(2020).mod(new BigInteger("1921")));
	}
//这是采用逐步取余的方法进行计算
	private static void demo1() {
		long a=7;
		for(int i=1;i<=2019;i++) {
			a *=7;
			a %=1921;
		}
System.out.println(a);
	}

}
