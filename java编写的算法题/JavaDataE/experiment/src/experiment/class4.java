package experiment;

import java.util.Scanner;

public class class4 {
	private  static int x;
	private  static int y;

	public class4(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//���������
	public int cheng() {
		return x*y;
	}
	public int chu() {
		return x/y;
	}
	public int jia() {
		return x+y;
	}
	public int jian() {
		return x-y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������x:");
		int x=sc.nextInt();
		System.out.println("������y:");
		int y=sc.nextInt();
		class4 c = new class4(x,y);
		int z=c.cheng();
		System.out.println("���������ĳ˻�Ϊ��"+z);

	}

}
