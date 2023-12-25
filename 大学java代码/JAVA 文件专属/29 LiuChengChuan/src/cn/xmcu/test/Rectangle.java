package cn.xmcu.test;

public class Rectangle {
   private double width;
   private double length;
   
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	public Rectangle() {
		
	}
	public double getArea() {
		double Area=0;
		return Area=width*length;
	}
   
}
