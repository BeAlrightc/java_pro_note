package suanFa;

public class TestHannoi {
	//此代码是关于汉诺塔移盘子的代码（递归调用）

	public static void main(String[] args) {  
		hanoi(3 ,'A','B','C');

	}
	/*
	 * @param n 共有N个盘子
	 * @param from 开始的柱子
	 * @param  in 中间的柱子
	 * @param  to 目标柱子
	 * 无论有多少个盘子，都认为只有两个盘子。上面的所有盘子和最下面一个盘子
	 * 总的规律来说，都是先将所有的盘子移到中间那个柱子当中然后再将盘子移到目标为最后
	 */
	public static void hanoi (int n,char from,char in,char to) {
		//只有一个盘子，递归终止条件出口
		if(n==1) {
			System.out.println("第1个盘子从"+from+"移到"+to);
			//无论有多少个盘子，都认为只有两个盘子。上面的所有盘子和最下面一个盘子
		}else {
			//第一步移动上面所有的盘子到中间位置，换一下位置（第三个参数都是目标位置）
			hanoi(n-1,from,to,in);
			//移动下面的盘子
			System.out.println("第"+n+"个盘子从"+from+"移到"+to);
			//第二步把上面所有的盘子从中间位置移到目标位置
			hanoi(n-1,in,from,to);
			
		}
	}

}
