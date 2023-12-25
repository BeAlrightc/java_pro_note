package xm.fj;

public class Circle implements Shape {
	
	private double radius;
	
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("园面积："+getArea());
		System.out.println("圆周长"+getPerimeter());

	}

}
