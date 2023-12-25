package Repete;

public class Director extends Employee {
   private String transportAllowance;
	
	public Director(String name, double basicPay, String address, String transportAllowance) {
		super(name, basicPay, address);
		this.transportAllowance = transportAllowance;
	}

	public Director(String name, double basicPay, String address) {
		super(name, basicPay, address);
	}

	public String getTransportAllowance() {
		return transportAllowance;
	}

	public void setTransportAllowance(String transportAllowance) {
		this.transportAllowance = transportAllowance;
	}
	 public void show() {
		 show();
		 System.out.println("交通津贴为:"+transportAllowance);
	 }
   
}
