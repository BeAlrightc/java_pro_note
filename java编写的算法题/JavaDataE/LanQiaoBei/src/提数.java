
public class 提数 {

	public static void main(String[] args) {
		int a =145;
		int b = a%10;
		int c = a/10%10;
		int d = a/100;
		int e =a%100;
		int f = a/10;
		System.out.println("a的个位是:"+b);
		System.out.println("a的十位是:"+c);
		System.out.println("a的百位是:"+d);
		System.out.println("输出十位和个位："+e);
        System.out.println("输出百位和十位："+f);
	}

}
