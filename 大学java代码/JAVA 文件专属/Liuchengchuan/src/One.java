import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final float PI=3.14f;
System.out.print("输入圆的半径: ");
Scanner input =new Scanner(System.in);
int radius =input.nextInt();

float circumference=2*PI*radius;

float square= PI*radius*radius;

System.out.println("圆的周长为 "+circumference+"。");
System.out.println("圆的面积为"+square+"。 \n");

	}

}
