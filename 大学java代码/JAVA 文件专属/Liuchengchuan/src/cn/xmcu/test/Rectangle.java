package cn.xmcu.test;

public class Rectangle {
 private int high;
 private int wide;
 
 public Rectangle(int high,int wide) {
	 this.high=high;
	 this.wide=wide;
	  }
 
 
public int getHigh() {
	return high;
}
public void setHigh(int high) {
	this.high = high;
}
public int getWide() {
	return wide;
}
public void setWide(int wide) {
	this.wide = wide;
}
public int getArea() {
	return wide*high;
}

 }
