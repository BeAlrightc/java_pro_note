package cn.xmcu.person;

public  class Teacher implements Person {
       private String name;
      
      
	
	

	public Teacher(String name) {
		super();
		this.name = name;
	}
	

	@Override
	public void eat() {
		// TODO Auto-generated method stub
    System.out.println("吃大餐");
    
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
    System.out.println("教师宿舍");
	}

}
