package cn.xmcu.test;

public class Director extends Employee {
     private String transportAllowance;

	public Director(String name, double basicPay, String address, String transportAllowance) {
		super(name, basicPay, address);
		this.transportAllowance = transportAllowance;
	}

	public Director(String name, String string, String address, String transportAllowance2) {
		// TODO Auto-generated constructor stub
	}

	public String getTransportAllowance() {
		return transportAllowance;
	}

	public void setTransportAllowance(String transportAllowance) {
		this.transportAllowance = transportAllowance;
	}
     public void showAll() {
    	 show();
    	 System.out.println("transportAllowance="+transportAllowance);
     }
}
