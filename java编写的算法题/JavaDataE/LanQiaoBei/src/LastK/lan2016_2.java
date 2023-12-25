package LastK;

public class lan2016_2 {
	/*
	 * 煤球数目
	 */

	public static void main(String[] args) {
		int count=0;//总的煤球数
		int you=0;//每层煤球的数目
		for(int i=1;i<=100;i++) {
			 you +=i;
			 count +=you;
		}
System.out.println(count);
	}

}
