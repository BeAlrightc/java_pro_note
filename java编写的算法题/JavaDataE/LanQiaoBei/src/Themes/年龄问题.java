package Themes;

public class 年龄问题 {
	/*
	 * 
	 * s夫人一向很神秘。这会儿有人问起她的年龄，她想了想说：
“20年前，我丈夫的年龄刚好是我的2倍，而现在他的年龄刚好是我的1.5倍”。

你能算出s夫人现在的年龄吗？

注意，需要提交的是一个整数，不要填写任何多余的内容。
	 */

	public static void main(String[] args) {
		int woman=0;
		for(int i=0;i<100;i++) {
			if(i%2==0) {//一定要能够被2整除,毕竟是偶数
				woman=i/2;//20年前夫人的年龄
				if((woman +20)*1.5 ==(i+20)) {//判断条件
					woman+=20;//夫人现在的年龄-
					System.out.println("丈夫的年龄："+(i+20)+"  s夫人的年龄："+woman);
				}
			}
		}

	}

}
