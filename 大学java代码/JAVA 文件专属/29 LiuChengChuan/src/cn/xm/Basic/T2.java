package cn.xm.Basic;

public class T2 {
	public static int times =5;

	public static void main(String[] args) {
		System.out.println("还剩"+ times +"次调用");
		if (times <=0) {
			System.exit(0);
		}
		main2(args);		
	}
	public static void main2(String[] args ) {
		times --;
		main(args);
	}

}
