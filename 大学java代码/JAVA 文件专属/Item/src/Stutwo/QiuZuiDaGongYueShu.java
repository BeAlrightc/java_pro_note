package Stutwo;

import java.util.Scanner;

public class QiuZuiDaGongYueShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in =new Scanner(System.in);
		 int a =in.nextInt();
		 int b= in.nextInt();
		 int gcd=1;
		 for (int i=2;i<=a && i<=b;i++)
		 {
			 if(a%i==0&& b%i==0)
			 {
				 gcd = i;
			 }
		 }
		 System.out.println(a+"和"+b+"的公约数是："+gcd);
	}

}
