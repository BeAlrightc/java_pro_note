package ControlandTrans;
/*
 * 
 */

public class demo2 {

	public static void main(String[] args) {
//		demo1();
//		demo2();
		/*
		 * 我想在控制台输出2次："java基础班"
		 * 我想在控制台输出7次："java基础班"
		 * 我想在控制台输出13次："java基础班"
		 */
for(int x=1;x<=10;x++) {
	if(x%3==0) {
		//break;
//		continue;
		System.out.println("java基础班");
	}
	System.out.println("java基础班");
}
	}

	private static void demo2() {
		System.out.println("大家好");
		http://www.heima.com http:在这里是一个合法的标识符
			System.out.println("才是真的好");
	}

	private static void demo1() {
		outer:for(int i =1;i<=10;i++) { //a就是标号，只要是合法标识符即可
			System.out.println("i="+i);
			inner:for(int j =1;j<=10;j++) {
				System.out.println("j ="+j);
				break outer;
			}
		}
	}

}
