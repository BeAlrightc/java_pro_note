import java.math.BigInteger;
import java.util.Scanner;

public class test {
	/*
	 * 请计算：
	 * 7 ^ 2020 mod 1921，其中 A mod B 表示 A 除以 B 的余数。
	 * 用大数类
	 */

	public static void main(String[] args) {
		 BigInteger s = new BigInteger("48");
		 //gcd()方法，用于求两个数之间的最大公约数
		 BigInteger i =s.gcd(new BigInteger("24"));
		 System.out.println(i);
	      
    }

	}


