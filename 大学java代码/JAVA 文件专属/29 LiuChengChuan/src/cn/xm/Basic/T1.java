package cn.xm.Basic;

public class T1 {

	public static void main(String[] args) {
		System.out.println("我是应用程序的入口main");
		main();
		main(0);
		main(1,2);						
	}
	public static void main() {
		System.out.println("我是无参的main");
	}
	
	public static void main(int x) {
		System.out.println("我是有int参数的main");
	}
	public static int main(int x,int y) {
		System.out.println("我是有两个参数并且有int型返回值的main");
		return 0;
	}

}
