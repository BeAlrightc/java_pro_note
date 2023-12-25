package xm.cu;

public class Car extends Vehicle {
	private double speed;
	private double time;
	private double windSpeed;
	
	

	public Car(double speed, double time, double windSpeed) {
		super();
		this.speed = speed;
		this.time = time;
		this.windSpeed = windSpeed;
	}

	@Override
	public double getDistance() {
		return (speed-windSpeed)*time;
		
	}

	@Override
	public void display(double distance) {
		System.out.println("汽车行驶的距离为："+(speed-windSpeed)*time+"Km");
	}

}
