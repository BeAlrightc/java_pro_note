package themes3;

import java.util.Scanner;

public class 分类计数 {
	/*
	 * 输入一个字符串，请输出这个字符串包含多少个大写字母，多少个小写字母，多少个数字。

【输入格式】

输入一行包含一个字符串。

【输出格式】

输出三行，每行一个整数，分别表示大写字母、小写字母和数字的个数。

【样例输入】

1+a=Aab

【样例输出】

1
3
1
	 */

	public static void main(String[] args) {
		Scanner sc =new  Scanner(System.in); 
       String str = sc.next();
        char [] ch =str.toCharArray();//将字符串转变位字符数组
        int [] num=new  int [3];//创建一个计数的数组
        for(int i=0;i<ch.length;i++) {
        	if(ch[i]>='0'&&ch[i]<='9') {//匹配0~9的数量
        		 num[2]++;//在2位置的数量加一
        	}else if(ch[i]>='a'&&ch[i]<='z'){//匹配a~z的数量
        		num[1]++;//在1位置的数量加一
        	}else if(ch[i]>='A'&&ch[i]<='Z') {
        		num[0]++;//在0位置的数量加一
        	}
        }
        for(int i=0;i<num.length;i++) {
        	System.out.println(num[i]);//输出各个位置的数量
        }
	}

}
