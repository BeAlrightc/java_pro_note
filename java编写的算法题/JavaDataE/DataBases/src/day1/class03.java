package day1;

public class class03 {

	public static void main(String[] args) {
		// 数据类型隐式转换
		int x =3;
		byte b =4;
		//当那个小的数据类型转换与大的数据类型相加时会转换为大的数据类型
		x = x+b;
		System.out.println(x);
		//数据类型之强制转换
		
		int a =10;
		byte c =20;
		//c = a+c;会出错
		c =(byte)(a+c);
		System.out.println(c);
		//00000000 00000000 00000001 00101100 300的二进制数
		//00101100 这是被强制转换为byte类型后被砍前三个八位
		byte b2 = (byte)300;
		System.out.println(b2);
		

	}

}
