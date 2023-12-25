package xm.fj;

public class Person {
    private String name;
    protected int age;
    public Person() {
    	
    }
	public Person(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("name="+name);
	}
    
}
