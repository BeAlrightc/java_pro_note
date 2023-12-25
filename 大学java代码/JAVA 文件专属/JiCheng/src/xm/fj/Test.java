package xm.fj;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student student = new Student("xmcu");
    student.setName("张三");
    student.setStuid("20160023");
    student.print();
    student.printld();
    
    student =new Student("xmcul","20160024");
    student.print();
    student.printld();
    Student student1 = new Student("xmcul","20160024",34);
    student.printAll();
	}

}
