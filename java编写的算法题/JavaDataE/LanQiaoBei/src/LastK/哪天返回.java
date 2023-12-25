package LastK;

public class 哪天返回 {
	/*
	 * 
	 * 小明被不明势力劫持。后被扔到x星站再无问津。小明得知每天都有飞船飞往地球，但需要108元的船票，而他却身无分文。
他决定在x星战打工。好心的老板答应包食宿，第1天给他1元钱。
并且，以后的每一天都比前一天多2元钱，直到他有足够的钱买票。
请计算一下，小明在第几天就能凑够108元，返回地球。
分析:

1、设置一个变量存小明每天的工资数，
2、设置一个变量存小明的工资
3、设置一个变量存日子数


要求提交的是一个整数，表示第几天。请不要提交任何多余的内容。
1.s=1 sum=1
2.s=3 sum=4
3.s=5 sum 9
4.s=7 sum =16
5.s=9 sum =25
6.s=11 sum=36
7.s=13 sum 49
8 s=15 sum =64
9. s=17 sum 81
10 s= 19 sum =100
11 s =21 sum 121   11天



	 */
	 

	public static void main(String[] args) {
		int sum=0;
		int sla=1;
		int d = 0;
		for(int i=0;sum<108;i++) {
			sum +=sla;
			sla +=2;
			d++;
		}
  System.out.println(d);
	}

}
