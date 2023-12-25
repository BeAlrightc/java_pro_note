package xm.fj;

public class Student extends Person {
  /**
   * 学号
   */
	private String stuid;


   public Student () {
	    
   }
   public Student(String stuid) {
	   super();
	   
	  this.stuid=stuid;
   }
   


public Student(String name, String stuid) {
	super(name);
	this.stuid = stuid;
}

public void setStuid(String stuid) {
	this.stuid = stuid;
	
  }
   public void printld() {
	   System.out.println("stuid="+stuid);
   }
   
	
}
