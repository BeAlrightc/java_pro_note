package StaticKnows;

import java.util.Scanner;

/*
 * A:案例演示：
 * 	需求：猜数字小游戏（数据在1-100之间）
 * 
 */

 class Test_GuessNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//创建键盘录入对象
		System.out.println("请输入一个整数，范围在1-100之间：");
		int guessNum = (int)(Math.random() *100) +1; //心里想的随机数
		while(true) {//因为需要猜很多次，所以用无限循环
			int result =sc.nextInt(); //大家猜的数
			if(result >guessNum) {//如果你们猜的数大于想的数就提示打了
				System.out.println("大了");
			}else if(result<guessNum) {//如果你们猜的数小于想的数提示笑了
				System.out.println("小了");
			}else {//猜的数不大有不小就猜对了
				System.out.println("猜对了");
				break;
			}
			
		}
	}

}
