import java.math.BigInteger;
import java.util.Scanner;

public class test {
	/*
	 * ����㣺
	 * 7 ^ 2020 mod 1921������ A mod B ��ʾ A ���� B ��������
	 * �ô�����
	 */

	public static void main(String[] args) {
		 BigInteger s = new BigInteger("48");
		 //gcd()������������������֮������Լ��
		 BigInteger i =s.gcd(new BigInteger("24"));
		 System.out.println(i);
	      
    }

	}


