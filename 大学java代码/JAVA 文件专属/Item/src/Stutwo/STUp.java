package Stutwo;

import java.util.Scanner;

public class STUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in =new Scanner(System.in);
		 int x;
		 double sum =0;
		 int cnt =0;
		 x=in.nextInt();//这些部分是用来输入数据的
		 if (cnt>0)
		 {
			 int [] numbers = new int[cnt];
			 for(int i=0;i<cnt;i++)
			 {
				numbers[i] =in.nextInt();
				sum+= numbers[i];
			 }
	         double average = sum/cnt;
			 for(int i=0;i<numbers.length;i++)
			 {
			 if (cnt>0)
			 {
				 if(numbers[i] > average)
					{
						System.out.println(numbers[i]);
				}
			}
				 System.out.println(sum/cnt);
			
	         }
		 
	    }
	}
}



