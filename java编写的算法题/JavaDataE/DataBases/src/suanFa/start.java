package suanFa;

public class start {

	public static void main(String[] args) {
		//遍历法求从0加到100要执行101次
//		int a =0;
//		for(int i =0;i<=10;i++) {
//			a =a+i;
//		}
//		System.out.println("a的值为："+a);
		//公式法只执行一次
		int total =1;
		int end =100;
		total =(1+end)*end/2;
		System.out.println(total);

	}

}
