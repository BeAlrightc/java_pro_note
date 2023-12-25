package Repete;

public class EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Manager Manager = new Manager("小敏",46,"fr","de");
    Manager.showAll();
    
    Manager manager = new Manager(null, 0, null);
    manager.setName("张三");
    manager.setBasicPay(12000);
    manager.setAddress("fj");
    manager.setDepartment("xm");
    manager.showAll();
    
    
    
	}

}
