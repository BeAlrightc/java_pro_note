package StaticKnows;

public class Demo2_static {

	public static void main(String[] args) {
//		Demo d = new Demo();
//		d.print();
		Demo.print2();
	}

}
/*
 * A:static 的注意事项
 * 	a:在静态方法中是没有this关键字的
 * 	如何理解呢：
 * 		静态是随着类加载而加载，this是随着对象的创建而存在
 * 		静态比对象先存在
 * 	b:静态方法只能访问静态的成员变量和静态的成员方法
 * 		静态方法：
 * 			成员变量：只能访问静态变量
 * 			成员方法：只能访问静态成员方法
 * 		非静态方法：
 * 			成员变量：可以是静态的，也可以是非静态的
 * 			成员方法：可以是静态的成员方法，也可以是非静态的成员方法。
 * 简单记：
 * 静态只能访问静态
 */
class Demo{
	int num1 = 10;//非静态的成员变量
	static int num2 = 20;//静态的成员变量
	
//	public void print() {//非静态的成员方法,既可以访问静态的也可以访问非静态的
//		System.out.println(num1);
//		System.out.println(num2);
//	}
	
	public static void print2() {//静态的成员方法
		//System.out.println(num1);静态方法不能访问非静态成员变量
		System.out.println(num2);
	}                                                                           
}