package know;

public class Demo2 {
	/*
	 * A��������ʾ��
	 *    �������1-10֮�������֮��
	 * B��ϰ��
	 * �������1-100���ż����   
	 * �������1-100���������   
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
