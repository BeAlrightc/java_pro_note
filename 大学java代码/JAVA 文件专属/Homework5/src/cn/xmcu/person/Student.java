package cn.xmcu.person;

public  class Student implements Person {
    private String name;

	

	public Student(String name) {
	super();
	this.name = name;
}

	public  void eat() {
		// TODO Auto-generated method stub
     System.out.println("小餐");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
    System.out.println("宿舍");
	}

}
