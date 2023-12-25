package cn.xmcu.greeting;

public class Student extends Person implements Greeting {
   
    String name;
    
public Student( String name) {
		super();
		this.name = name;
	}




public void print() {
	   System.out.println("我更不知道");
   }
}
