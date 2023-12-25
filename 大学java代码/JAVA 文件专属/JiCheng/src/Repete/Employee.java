package Repete;


public class Employee {
	private String name;
	private double basicPay;
	private String address;
	public Employee() {
		
	}
	public Employee(String name, double basicPay, String address) {
		super();
		this.name = name;
		this.basicPay = basicPay;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void show() {
		System.out.println("名字:"+name);
		System.out.println("基本工资:"+basicPay);
		System.out.println("地址:"+address);
	}
	
	
	

}
