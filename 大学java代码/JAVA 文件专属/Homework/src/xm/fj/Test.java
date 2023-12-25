package xm.fj;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student student = new Student();
     student.setName("张三");
     student.setStuid("200100033");
     student.print();
     student.printld();
     
     
     Student student1 = new Student("200100034");
     student1.print();
     student1.printld(); 
     
     
     Student student2 = new Student("李四","2001000235");
     student2.print();
     student2.printld();
     
     Person person = new Person();
     System.out.println(person instanceof Person);
     System.out.println(person instanceof Student);
     
     Person person1 =(Person)student;
	}

}
