package Stutwo;

import java.util.Scanner;

public class ZhaoShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    int[] data= {3,2,5,7,8,22,34,28,78};
    int x =in.nextInt();
    int loc=0;
    for(int i=0;i<data.length; i++)
    {
    	if(x==data[i])
    	{
    		loc=i;
    		break;
         }
    }
    if(loc>=0)
    {
    	System.out.println(x+"是第"+(loc+1)+"个");
    }
    else
    {
    	System.out.println(+x+"不在其中");
    }
 }

}
