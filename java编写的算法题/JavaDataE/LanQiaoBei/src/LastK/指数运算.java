package LastK;

import java.math.BigInteger;

public class ָ������ {
	/*����㣺7 ^ 2020 mod 1921������ A mod B ��ʾ A ���� B ������*/

	public static void main(String[] args) {
		BigInteger c =new BigInteger("7");
		System.out.println(c.pow(2020).mod(new BigInteger("1921")));//���Ϊ��480

	}

}
