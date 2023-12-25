package themes3;

public class 猜数 {
	/*
	 * 到x星球旅行的游客都被发给一个整数，作为游客编号。
  x星的国王有个怪癖，他只喜欢数字3,5和7。
  国王规定，游客的编号如果只含有因子：3,5,7,就可以获得一份奖品。
   我们来看前10个幸运数字是：
  3 5 7 9 15 21 25 27 35 45
  因而第11个幸运数字是：49
 小明领到了一个幸运数字 59084709587505，他去领奖的时候，人家要求他准确地说出这是第几个幸运数字，否则领不到奖品。
 请你帮小明计算一下，59084709587505是第几个幸运数字。
  需要提交的是一个整数，请不要填写任何多余内容。
	 */

	public static void main(String[] args) {
		long max = 59084709587505l;
		int count =0;
		for(long i=0;Math.pow(3,i) <max;++i)
			for(long j=0;Math.pow(5, j) <max;++j)
				for(long k =0;Math.pow(7, k) <max;++k)
					if(Math.pow(3, i) * Math.pow(5, j) * Math.pow(7,k) <max)
						count ++;
		System.out.println(count);
	}
}
