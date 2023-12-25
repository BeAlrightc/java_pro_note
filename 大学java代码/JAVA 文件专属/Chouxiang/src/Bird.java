
public abstract class Bird extends Animal{
     String feather;
     
     
	public Bird(String feather) {
		System.out.println("创建了鸟类");
		this.feather= feather;
	}
	
	public void growFeather() {
		System.out.println("长满"+feather+"羽毛");
	}
	
	abstract public void move();
	
	public void resproduce() {
		System.out.println("下蛋");
	}
}
