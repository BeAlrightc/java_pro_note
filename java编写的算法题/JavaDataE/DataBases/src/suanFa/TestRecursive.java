package suanFa;
//递归操作！！！
public class TestRecursive {

	public static void main(String[] args) {
		print(10);

	}
	//递归方法
	public static void print(int i) {
		if(i>0) {
		System.out.print(i+" ");
		print(i-1);//又调用了一次print方法
	}
	}
}
