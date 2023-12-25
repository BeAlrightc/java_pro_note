
public class excise3 {
	/*
	 * 
	 * s夫人一向很神秘。这会儿有人问起她的年龄，她想了想说：
“20年前，我丈夫的年龄刚好是我的2倍，而现在他的年龄刚好是我的1.5倍”。

你能算出s夫人现在的年龄吗？

注意，需要提交的是一个整数，不要填写任何多余的内容。
	 */


	public static void main(String[] args) {
		int woman =0;
		for(int i=0;i<=100;i++) {
			if(i% 2==0) {//排除奇数年龄
				woman=i/2;
				if((woman+20)*1.5==i+20) {
					System.out.println("s夫人的年龄为："+(woman+20));
					break;
				}
			}
		}
	}

}
