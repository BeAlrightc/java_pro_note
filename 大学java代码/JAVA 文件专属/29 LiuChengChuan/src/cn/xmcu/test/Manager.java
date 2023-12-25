package cn.xmcu.test;

public class Manager extends Employee {
	private String department;

	public Manager(String name, double basicPay, String address, String department) {
		super(name, basicPay, address);
		this.department = department;
	}
	public Manager(String name, String string, String address, String department2) {
		// TODO Auto-generated constructor stub
		
	}

	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public void showAll() {
		show();
		System.out.println("department="+department);
	}


	

}
