package DUOTAI;

public class student extends Person {
     private String stuid;

	public student(String name, String stuid) {
		super(name);
		this.stuid = stuid;
	}

	public String getStuid() {
		return stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
     
	@Override
	public void display() {
		super.display();
		System.out.println("stuid:"+stuid);
	}

}
