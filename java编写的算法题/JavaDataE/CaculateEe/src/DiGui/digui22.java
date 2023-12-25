 package DiGui;

public class digui22 {

	public static void main(String[] args) {
		int y =digui(1,10);
		int m = digui1(1,4);
		System.out.println(m);
		System.out.println(y);
	}
	public static int digui(int start,int end) {
		if(start==end) {
			return end;
		}
		return start+digui(start+1,end);
	}

	public static int digui1(int start,int end) {
		if(start==end) {
			return end;
		}
		return start*digui1(start+1,end);
	}
}
