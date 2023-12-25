package DUOTAI;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person person1 = new Person("xmcu");
       person1.speak();
       person1.speak("类的多态之一是方法的重载");
       
       Person person = new student("xmcu","1101");
       person.display();
       
	}

}
