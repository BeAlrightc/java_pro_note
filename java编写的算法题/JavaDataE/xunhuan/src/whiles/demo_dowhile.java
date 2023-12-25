package whiles;

public class demo_dowhile {

	public static void main(String[] args) {
//		demo1();
//	demo2();
//		demo3();
	}

	private static void demo3() {
		int i=1;
		while(true) {//while语句的无限循环
			if(i>11) {
				System.out.println(i);
				break;
			}		
			i++;
		}
		for(; ;) {//for语句的无限循环
			System.out.println("helloworld");
		}
	}

	private static void demo2() {//for 与while的比较
		for(int i=1;i<=10;i++) {
			System.out.print(i);
		}
//	System.out.println(i);for语句执行后变量会被释放掉，不能被使用
    System.out.println("-----------");
    int i =1;
   while(i<=10) {
		System.out.print(i);
		i++;
}
System.out.print(i);//while语句执行后，初始化变量还可以使用
	}

	private static void demo1() {
		//while 和dowhile的区别
		int i =11;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);//dowhile循环中无论条件是否满足，都会执行一次
		System.out.println("--------------");
		int j =11;
		while(j<=10) {
			System.out.println("j = "+j);
			j++;
		}
	}

}
