package cn.xmcu.test;

public class EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Manager Manager = new Manager("李四",45.0,"漳州","领导");
     Manager.showAll();
      Manager manager = new Manager(null, 0, null, null);
     manager.setName("张飞");
     manager.setBasicPay(45.0);
     manager.setAddress("厦门");
     manager.setDepartment("组织部");
     manager.showAll();
     Director Director= new Director("xmcucl",34.0,"usa","cleaner");
     Director.showAll();
     Director.setName("李四");
     Director.setBasicPay(34.0);
     Director.setAddress("赣州");
     Director.setTransportAllowance("1000");
     Director.showAll();
	}

}
