package Themes;

import java.math.BigInteger;

public class ָ������ {
	//����㣺7 ^ 2020 mod 1921������ A mod B ��ʾ A ���� B ��������

	public static void main(String[] args) {
//		demo1();
		//���ַ����ǲ��ô�����BigInteger�����м����
		BigInteger s = new BigInteger("7");
	      System.out.println( s.pow(2020).mod(new BigInteger("1921")));
	}
//���ǲ�����ȡ��ķ������м���
	private static void demo1() {
		long a=7;
		for(int i=1;i<=2019;i++) {
			a *=7;
			a %=1921;
		}
System.out.println(a);
	}

}
