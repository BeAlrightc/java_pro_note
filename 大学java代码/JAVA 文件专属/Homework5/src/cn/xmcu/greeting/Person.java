package cn.xmcu.greeting;

public abstract class Person implements Greeting {
    String name;
    
	public Person(String name) {
		super();
		this.name = name;
	}
	

	public Person() {
		super();
	}


	@Override
	public void say() {
		// TODO Auto-generated method stub
     System.out.println("我不知道你在说什么");
	}

}
