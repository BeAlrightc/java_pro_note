package Stutwo;

import java.util.Scanner;

public class JieCheng2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    System.out.println("请输入一个数字");
    int nu=in.nextInt();
    int factor=1;
    int i=0;
    while (i<nu)
    {
    	i=i+1;
    	factor=factor*i;
    	
    }
//    for (i=1;i<=nu;i++)
//    {
//    	factor=factor*i;
//    
//    }
    System.out.println(factor);
	}

}
