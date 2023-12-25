
public class Seagul extends Bird {

	public Seagul(String feather) {
		super(feather);
		System.out.println("我们创造了海鸥");
	}

	@Override
	public void move() {
		System.out.println("海鸥飞翔");
		
	}

	@Override
	public void eat() {
	     System.out.println("海鸥吃鱼");
		
	}

	@Override
	public void responce() {
		// TODO Auto-generated method stub
		
	}

	
}
