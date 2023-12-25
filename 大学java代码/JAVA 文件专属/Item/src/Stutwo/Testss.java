package Stutwo;
/*此题求1-1/2+1/3-1/4++1/n;的代码
 * 
 * 
 * 
 */
import java.util.Scanner;

public class Testss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in =new Scanner(System.in);
    int n= in.nextInt();
    double sum =0.0;
    int sign=1;
    for (int i=1; i<=n;i++)
    {
//    	sum+= sign*1.0/i;
//    	sign=-sign;
    	if (i%2==1)
    	{
    		sum+= 1.0/i;
    	}
    	else
    	{
    		sum-=1.0/i;
    	}
    }
    System.out.printf("%.2f",sum);
 }
}
