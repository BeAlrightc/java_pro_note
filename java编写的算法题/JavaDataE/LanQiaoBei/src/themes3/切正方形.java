package themes3;

public class 切正方形 {
	/*
	 * 小明有一些矩形的材料，他要从这些矩形材料中切割出一些正方形。

当他面对一块矩形材料时，他总是从中间切割一刀，切出一块最大的正方 形，剩下一块矩形，
然后再切割剩下的矩形材料，直到全部切为正方形为止。 例如，对于一块两边分别为 5 和 3 的材料（记为 5×3），
小明会依次切出 3×3、2×2、1×1、1×1 共 4 个正方形。 现在小明有一块矩形的材料，两边长分别是 2019 和 324。请问小明最终会 切出多少个正方形？
6个324为边长的，4个75为边长的，3个24为边长的，8个3为边长的=21个（暴力破解法）
	 */

	public static void main(String[] args) {
	int len =2019;
	int wide = 324;
	int ans=0;
	while(len>=1&&wide>=1) {//假定他们的边长最后是至少为1的时候就结束循环
		if(len>wide) {
			len-=wide;//长减宽
		}else {
			wide-=len;//宽减长
		}
		ans++;//每减一次ans加一
	}
	System.out.println(ans);

	}

}
