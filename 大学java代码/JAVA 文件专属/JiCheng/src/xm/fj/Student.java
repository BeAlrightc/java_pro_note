package xm.fj;

public class Student extends Person {
    private String stuid;
    
    public Student(String name) {
    	super(name);
    }
    
    public Student(String name,String stuid) {
    	super(name);
    	this.stuid=stuid;
    }
    public Student(String name,String stuid,int age) {
    	this(name,stuid);
    	this.age=age;
    }

	public String getStuid() {
		return stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
    
	public void printld() {
		System.out.println("stuid="+stuid);
		
	}
	public void printAll() {
		print();
		printld();
		System.out.println("age="+super.age);
	}
}
