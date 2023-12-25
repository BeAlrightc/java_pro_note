package xm.cu;

public class Bicycle extends Vehicle {
	private double speed;
	private double time;
	
	
	

	

	public Bicycle(double speed, double time) {
		super();
		this.speed = speed;
		this.time = time;
		
	}

	@Override
	public double getDistance() {
	    return speed*time ;
	}

	@Override
	public void display(double distance) {
	System.out.println("摩托车行驶的距离为："+speed*time+"Km");

	}

}
