package DiGui;

public class 翻转字符串 {
	//将正序的字符串逆序输出

	public static void main(String[] args) {
		System.out.println(reverse("abcde",4));

	}
 
	public static String reverse(String src,int end) {
		if(end==0) {//当字符等于0的时候返回第一个字符
			return ""+src.charAt(0);
		}
		return src.charAt(end)+reverse(src,end-1);
	}
}
