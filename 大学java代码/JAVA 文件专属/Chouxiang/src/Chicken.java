
public class Chicken extends Bird{

	public Chicken(String feather) {
		super(feather);
		System.out.println("我是一只小鸡");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("小鸡快跑");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("小鸡吃米");
	}

	@Override
	public void responce() {
		// TODO Auto-generated method stub
		System.out.println("下蛋");
	}

}
