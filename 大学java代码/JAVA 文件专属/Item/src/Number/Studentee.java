package Number;

public class Studentee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Studente stu1 = new Studente();
    Studente stu2 =new Studente("1234","李四","男","360724","云计算20A班");
    stu1.display();
    stu2.display();
    stu1.setName("李云龙");
    stu1.setStuid("1234567");
    stu2.setName("张五");
    
    stu1.display();
    stu2.display();
    
    		
    
		
	}

}
