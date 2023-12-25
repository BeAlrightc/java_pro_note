package experiment;

public class class2 {
	//++q为前置递增表达式，规律：先自加再返回原值
	//q++为后置递增表达时   规律：先返回原值后自加
	//通过代码实践

	public static void main(String[] args) {
	     method1();
         method2();
         method3();
	}

	private static void method3() {
		int q=10;
         int f = q++ + ++q; //1.q=11,q++=10 2.q=12 ++q=12  => f=10+12=22
         System.out.println(f);//输出的值为22
	}

	private static void method2() {
		int q=10;
         q++; //单独使用的时候，q=11,++q=11 两者并无差别
         int m = q++ + 2;//  根据规律：先返回原值后自加 ，此时q=12 ,q++=11  所以 m=11+2=13
         System.out.println(m);//输出的值为 13
	}

	private static void method1() {
		int q=10;
		++q;//此时，q=11,++q=11 两者并无差别
		int m =++q + 2 ; //当++q与其他值相加的时候， 这时q=12,++q=12 q的值与++q的值同步增加 所以  => m= 12+2=14
		System.out.println(m); //输出的值为 14
	}

}
