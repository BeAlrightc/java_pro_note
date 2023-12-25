package xm.cv;

public class ProjectManager extends AliMaMaCompany {
	private String name;
	private int id;
	private double pay;
	private double bonus;
	
	

	public ProjectManager(String name, int id, double pay, double bonus) {
		super();
		this.name = name;
		this.id = id;
		this.pay = pay;
		this.bonus = bonus;
	}

	@Override
	public double Salary() {
		// TODO Auto-generated method stub
		return 12*pay+bonus;
	}

	@Override
	public void BasicInformation(String name, int id, double pay, String dowork) {
		// TODO Auto-generated method stub
		System.out.println("员工姓名："+name);
		System.out.println("工号："+id);
		System.out.println("薪资："+pay);
		System.out.println("工作内容：管理项目进度");


	}

}
