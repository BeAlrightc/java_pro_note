package DoubleCircle;
/*
 * 循环的嵌套
 */

public class Demo1_Forfor {

	public static void main(String[] args) {
//		demo1();
		demo2();

	}

	private static void demo2() {//打印4行5列的星星
		for(int i=1;i<=4;i++) {//外循环决定行数
			for(int j=1;j<=4;j++ ) {//内循环决定列数
				System.out.print("*");//输出*
			}
			System.out.println();//换行
		}
	}

	private static void demo1() {
		for(int i=1;i<=3;i++) {//外循环
			System.out.println("i = "+i);
			for(int j =1;j<=3;j++) {//内循环
				System.out.println("j = "+j);
			}
		}
		
	}

}
