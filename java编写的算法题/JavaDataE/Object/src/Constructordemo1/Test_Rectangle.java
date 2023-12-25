package Constructordemo1;

public class Test_Rectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,20);
		System.out.println("长方形的面积为："+r1.mianji());
		System.out.println("长方形的周长为："+r1.ZhouChang());

	}

}
/*
 * A:案例演示：
 *  需求：
 *  	定义一个长方形类，定义，求周长和面积的方法
 *  	然后定义一个测试类进行测试
 */
class Rectangle{
	 private int length;
	 private int width;
	 
	 public Rectangle() {
		 
	 }

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public int mianji() {
		return length*width;
	}
	 
	public int ZhouChang() {
		return (length+width)*2;
	}
	 
}