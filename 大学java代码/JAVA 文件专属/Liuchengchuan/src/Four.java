import java.util.Scanner;
public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long sum=1;
Scanner sin = new Scanner(System.in);
System.out.print("请输入一个数字:");
int s =sin.nextInt();
for(int i=1;i<=s;i++) {
	sum=sum*i;
	
}
System.out.print(s+"  的阶乘为："+sum);

	}

}
