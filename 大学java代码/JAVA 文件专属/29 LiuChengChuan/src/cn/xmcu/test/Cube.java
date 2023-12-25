package cn.xmcu.test;

public class Cube extends Rectangle {
       private double height;
      

	public Cube(double width, double length, double height) {
		super(width, length);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
       public double getVolume() {
    	   double Volume=0;
    	  return Volume=height*super.getArea();
    	
    	
    	   
       }
}
