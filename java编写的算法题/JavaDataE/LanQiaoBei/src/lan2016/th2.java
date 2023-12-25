package lan2016;

public class th2 {

	public static void main(String[] args) {
		int a =0;//存每次要加的数
		int m=0;//用一个数存每层煤球的个数
		for(int i=1;i<=100;i++) {
			a +=i;
			m +=a;
		}
		System.out.println(m);	
	}

}
