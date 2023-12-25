package q3;

public class Person {
	
	private String name;
	
	public Person(){		
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print(){
		System.out.println("姓名:"+name);
	}

}
