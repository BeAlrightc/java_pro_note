package q3;

public class Student extends Person {
     private int stuId;

	

	public Student(String name) {
		super(name);
	}

	public Student(String name, int stuId) {
		super(name);
		this.stuId = stuId;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	
	public void print(){
		
		System.out.println("学号:"+stuId+";");
		super.print();
	}
	
}
