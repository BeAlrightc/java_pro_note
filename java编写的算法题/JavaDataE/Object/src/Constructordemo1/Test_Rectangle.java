package Constructordemo1;

public class Test_Rectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,20);
		System.out.println("�����ε����Ϊ��"+r1.mianji());
		System.out.println("�����ε��ܳ�Ϊ��"+r1.ZhouChang());

	}

}
/*
 * A:������ʾ��
 *  ����
 *  	����һ���������࣬���壬���ܳ�������ķ���
 *  	Ȼ����һ����������в���
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