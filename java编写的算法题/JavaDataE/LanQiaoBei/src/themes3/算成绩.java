package themes3;

import java.util.Scanner;

public class 算成绩 {
	/*
	 * 小蓝给学生们组织了一场考试，卷面总分为 100 分，每个学生的得分都是一个 0 到 100 的整数。
如果得分至少是 60 分，则称为及格。如果得分至少为 85 分，则称为优秀。
请计算及格率和优秀率，用百分数表示，百分号前的部分四舍五入保留整数。

【输入格式】

输入的第一行包含一个整数 n，表示考试人数。
接下来 n 行，每行包含一个 0 至 100 的整数，表示一个学生的得分。

【输出格式】

输出两行，每行一个百分数，分别表示及格率和优秀率。百分号前的部分四舍五入保留整数。

	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		System.out.println(N);
		double[] arr = new double[N];//创建一个数组（设置其大小为N）
		double YO=0;//优秀人数
		double ji=0;//及格人数
		for(int i=0;i<N;i++) {//遍历
			arr[i]=sc.nextDouble();//依次遍历输入成绩数据
			if(arr[i]>=60) {//如果成绩大于60
				ji++;
			}
			if(arr[i]>=85) {//如果成绩大于85
				YO++;
			}
		
		}
		System.out.println(ji);
		System.out.println(YO);
		System.out.println(Math.round((ji/N)*100)+"%");//使用round方法进行四舍五入取整
		System.out.println(Math.round((YO/N)*100)+"%");
		
	}

}
