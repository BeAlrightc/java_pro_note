package xm.cv;

public class ProductManager extends AliMaMaCompany {
	private String name;
	private int id;
	private double pay;
	
	
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
		System.out.println("工作内容：管理产品");

	}

}
