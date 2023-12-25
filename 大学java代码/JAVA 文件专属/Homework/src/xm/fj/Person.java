package xm.fj;

public class Person {
      private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}
		public Person() {
			
		}
		

	public void print() {
		System.out.println("name="+this.name);
	}
      
      
}
