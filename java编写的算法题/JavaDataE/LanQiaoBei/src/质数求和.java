import java.util.Scanner;

public class 质数求和 {
	/*
	 * 我们知道第一个质数是 2、第二个质数是
	 *  3、第三个质数是 5……
	 *  请你计算 第 2019 个质数是多少？
	 */

	public static void main(String[] args) {
	System.out.println("请输入你想要输入的质数个数");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int er=0;
	int ou=0;
	while(ou<=a) {
		er++;
		if(check(er)) {
			ou++;
		}
	}
	System.out.println(er);
	
	}

	private static boolean check(int er) {
		int flag=0;
		for(int i=2;i<er;i++) {
			if(er%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			return false;
		}else {
			return true;
		}
	}


		
	

}
