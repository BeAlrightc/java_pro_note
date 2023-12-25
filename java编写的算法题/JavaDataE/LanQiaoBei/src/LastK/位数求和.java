package LastK;

public class 位数求和 {
	/*
	 * 小明对数位中含有 2、0、1、9 的数字很感兴趣，
	 * 在 1 到 40 中这样的数包 括 1、2、9、10 至 32、39 和 40，
	 * 共 28 个，他们的和是 574。 请问，在 1 到 2019 中，所有这样的数的和是多少？
	 */

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=2019;i++) {
			String a=i+"";
			if(a.contains("2")|| a.contains("0") || a.contains("1") || a.contains("9") ) {
				sum +=i;
				
			}
		}
		System.out.println(sum);
	}

}
