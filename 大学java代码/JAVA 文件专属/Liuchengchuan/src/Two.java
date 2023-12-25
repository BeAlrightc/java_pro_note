import java.util.Scanner;

public class Two {
Two()
{
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double a;
    double b;
    double c;
    System.out.print("请输入三个数");
    Scanner in  =new Scanner(System.in);
    a=in.nextDouble();
    b=in.nextDouble();	
    c=in.nextDouble();
    if(a<=0 || b<=0 || c<=0) {
    	System.out.println("输入数：");
    }
    if((a+b)>c&&(a+c)>b&&(b+c)>a){
    	System.out.println("是三角形");
    }else {
    	System.out.println("不是三角形");
    }
    }

}
