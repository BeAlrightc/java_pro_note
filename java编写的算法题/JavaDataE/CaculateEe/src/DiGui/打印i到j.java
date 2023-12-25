package DiGui;

public class 打印i到j {

	public static void main(String[] args) {
           f2(2,10);
	}
	
	public static void f2(int i,int j) {
		if(i>j) {//如果i>j的话就终止打印
			return;
		}
		System.out.println(i);
		f2(i+1,j);//连续调用方法
	}
}
