package day1;

public class class03 {

	public static void main(String[] args) {
		// ����������ʽת��
		int x =3;
		byte b =4;
		//���Ǹ�С����������ת�����������������ʱ��ת��Ϊ�����������
		x = x+b;
		System.out.println(x);
		//��������֮ǿ��ת��
		
		int a =10;
		byte c =20;
		//c = a+c;�����
		c =(byte)(a+c);
		System.out.println(c);
		//00000000 00000000 00000001 00101100 300�Ķ�������
		//00101100 ���Ǳ�ǿ��ת��Ϊbyte���ͺ󱻿�ǰ������λ
		byte b2 = (byte)300;
		System.out.println(b2);
		

	}

}
