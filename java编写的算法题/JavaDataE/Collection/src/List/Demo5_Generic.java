package List;

import java.util.ArrayList;
import java.util.List;

import bean.Person;
import bean.Student;

public class Demo5_Generic {
	/*
	 * A������ͨ���<?>
	 * 	�������ͣ����û����ȷ����ô����Object�Լ������java��
	 * B��?extends E
	 * �����޶���E������
	 * C:��super E
	 * �����޶���E���丸��
	 */


	public static void main(String[] args) {
		//List<?>list = new ArrayList<Integer>();//���ұ߷��Ͳ�ȷ��ʱ����߿���ָ��Ϊ?
	   ArrayList<Person> list1 = new ArrayList<>();
	   list1.add(new Person("����",23));
	   list1.add(new Person("����",24));
	   list1.add(new Person("����",25));
	   
	   ArrayList<Student> list2 = new ArrayList<>();
	   list2.add(new Student("����",26));
	   list2.add(new Student("����",27));
	   
	   list1.addAll(list2);//��list2���뵽list1
	   System.out.println(list1);
	}

}
