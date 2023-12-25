import java.util.Scanner;

public class 算成绩 {

	public static void main(String[] args) {
		demo1();
	//	demo2();
	}

	private static void demo2() {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		double [] arr = new double[N];
		double ji=0;;
		double you=0;
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextDouble();
			if(arr[i]>=60) {
				ji++;
				} if(arr[i]>=85) {
				you++;
			}
		}
		System.out.println(Math.round((ji/N)*100)+"%");
		System.out.println(Math.round((you/N)*100)+"%");
	}

	private static void demo1() {
		Scanner sc =new Scanner(System.in);
		 int N = sc.nextInt();//人数
		 double [] arr = new double[N];
		 double ji=0;
		 double yo=0;
		 for(int i=0;i<N;i++) {//记住不能使用else if
			 arr[i]=sc.nextDouble();
			 if(arr[i]>=60) {
				 ji++;
			 }if(arr[i]>=85) {
				 yo++;
			 }
		 }
System.out.println(Math.round((ji/N)*100)+"%");
System.out.println(Math.round((yo/N)*100)+"%");
	}

}
