package themes2;

public class 末尾数为本数 {
	/*
	 * 有些数字的立方的末尾正好是该数字本身。
比如：1,4,5,6,9,24,25,…

请你计算一下，在10000以内的数字中（指该数字，并非它立方后的数值），符合这个特征的正整数一共有多少个。

请提交该整数，不要填写任何多余的内容。
	 */

	public static void main(String[] args) {
		int count=0;//定义一个计数器
//		int yu =1;//不能将求余数放在此处进行初始化
	for(int i=1;i<=10000;i++) {
		String n = i+"";//转换为字符串类型
		int yu =1;//将yu放在此处进行初始化，每次循环结束之后都会变为1
		for(int j=0;j<n.length();j++) {//这个过程只是为了求yud的值
			yu*=10;
		}
		if(i==Math.pow(i,3)%yu) {
			count ++;
		}
//		System.out.println("hi"); 
	}
	System.out.println(count);
	}

}
