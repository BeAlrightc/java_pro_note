package TanXin;

import java.util.Arrays;

public class FindContentChildren {
	

	public static void main(String[] args) {
		
	
	}
	
	static int solution(int[]children,int[]cookies) {
		Arrays.sort(children);
		Arrays.sort(cookies);
		int child =0;//能吃饱的孩子的数量
		int cookie=0;
		while(child <children.length &&cookie<cookies.length) {
			if(children[child]<=cookies[cookie++]) {
				child++;
			}
		}
		return child;
	}

}
