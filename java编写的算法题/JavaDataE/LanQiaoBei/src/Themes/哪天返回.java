package Themes;

public class 哪天返回 {
	/*
	 * 小明被不明势力劫持。后被扔到x星站再无问津。小明得知每天都有飞船飞往地球，但需要108元的船票，而他却身无分文。
他决定在x星战打工。好心的老板答应包食宿，第1天给他1元钱。
并且，以后的每一天都比前一天多2元钱，直到他有足够的钱买票。
请计算一下，小明在第几天就能凑够108元，返回地球。

要求提交的是一个整数，表示第几天。请不要提交任何多余的内容。
	 */

	public static void main(String[] args) {
	int salary=1;//每天的工资
	int money=0;//钱的总数
	int i ;
	for( i =0;money<=108;i++) {
		money +=salary;
		salary+=2;
	}
	System.out.println(i);

	}

}
