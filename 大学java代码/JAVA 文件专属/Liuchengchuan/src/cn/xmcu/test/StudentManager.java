package cn.xmcu.test;

public class StudentManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student stu1 =new Student();
Student stu2 =new Student("200250200","张三","男","360724200103049016","云计算20B");
stu1.display();
stu2.display();
stu1.setName("李国庆");
stu1.setStuid("1234567");
stu1.display();
	}

}
