import java.util.Scanner;
public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("请输入一个整数");
int number =sc.nextInt();

int sum=0;

while (number > 0) {
	sum+=number %10;
	number =number /10;
	
}
System.out.println("各位数字之和为"+sum);

	}

}
