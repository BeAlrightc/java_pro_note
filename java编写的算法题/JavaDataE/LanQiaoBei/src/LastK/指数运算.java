package LastK;

import java.math.BigInteger;

public class 指数运算 {
	/*请计算：7 ^ 2020 mod 1921，其中 A mod B 表示 A 除以 B 的余数*/

	public static void main(String[] args) {
		BigInteger c =new BigInteger("7");
		System.out.println(c.pow(2020).mod(new BigInteger("1921")));//求出为：480

	}

}
