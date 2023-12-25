package know;

public class Demo2 {
	/*
	 * A：案例演示：
	 *    需求：求出1-10之间的数据之和
	 * B练习：
	 * 需求：求出1-100间的偶数和   
	 * 需求：求出1-100间的奇数和   
	 */

	public static void main(String[] args) {
//		demoA();
		int sumou=0;
		int sunqi=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sumou+=i;
			}else {
				sunqi+=i;
			}
		}
		System.out.println(sumou);
		System.out.println(sunqi);
	}

	private static void demoA() {
		int sum =0;
		for(int i =1;i<=10;i++) {
			sum +=i;
		}
System.out.println(sum);
	}

}
