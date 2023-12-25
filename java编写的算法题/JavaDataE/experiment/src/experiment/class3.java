package experiment;

public class class3 {
	//加强版练习
	/*
	 * 接下来我们使用规律来计算下面的式子
	 * 实现： 1.q++ + ++q + q++
	 *       2.++q + q++ + ++q
	 *       3.q++ + q++ + q++
	 *       4.++q + ++q + ++q
	 */ 

	public static void main(String[] args) {
		method1();
        method2();
		method3();
		int q=10;
		int f =++q + ++q + ++q; //1.q=11,++q=11 2.q=12,++q=12 3.q=13,++q=13 =>11+12+13=36
		System.out.println(f);
	}

	private static void method3() {
		int q=10;
		int f = q++ + q++ + q++; //1.q=11,q++=10 2.q=12 q++=11 3.q=13 ,q++=12 =>f=10+11+12=33
		System.out.println(f);
	}

	private static void method2() {
		int q=10;
        int f =++q + q++ + ++q; //1.q=11,++q=11 2. q=12,q++=11 3.q=13,++q=13 =>f=11+11+13=35
        System.out.println(f);//输出值为35
	}

	private static void method1() {
		int q=10;
		int f =q++ + ++q + q++;// 1.q=11,q++=10; 2.q=12,++q=12 3.q=13 q++=12 => f=10+12+12=34
		System.out.println(f);
	}

}
