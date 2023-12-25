package DoubleCircle;

public class Chengfa {
	/*
	 * 
	 * 请输出九九乘法表
	 */

	public static void main(String[] args) {
//		demo1();
System.out.println("\"");//转义双引号
System.out.println('\'');//转义单引号
	}

	private static void demo1() {//打印九九乘法表
		for(int i=1;i<=9;i++) {//打印行数
			for(int j=1;j<=i;j++) {//打印列数
				System.out.print(i+"*"+j+"="+i*j+'\t');//输出内容用相应的格式
			}
			System.out.println();
		}
	}

}
