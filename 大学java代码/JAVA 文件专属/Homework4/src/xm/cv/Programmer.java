package xm.cv;

public class Programmer extends AliMaMaCompany {
	private String name;
	private int id;
	private double pay;
	
	

	public Programmer(String name, int id, double pay) {
		super();
		this.name = name;
		this.id = id;
		this.pay = pay;
	}

	@Override
	public double Salary() {
		// TODO Auto-generated method stub
		return 12*pay;
	}

	@Override
	public void BasicInformation(String name, int id, double pay, String dowork) {
		// TODO Auto-generated method stub
		System.out.println("员工姓名："+name);
		System.out.println("工号："+id);
		System.out.println("薪资："+pay);
		System.out.println("工作内容：写代码");

	}

}
