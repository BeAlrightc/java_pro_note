package DiGui;

public class 最大公倍数 {

	public static void main(String[] args) {
		int y =gcc(12,2);
		System.out.println(y);

	}
public static int gcc(int m,int n) {
	if(n==0)
		return m;
	
	return gcc(n,m%n);
}
}
