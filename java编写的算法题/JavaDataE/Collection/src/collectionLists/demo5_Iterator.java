package collectionLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import bean.Student;

public class demo5_Iterator {
	/*
	 * ����
	 *  A.��������1
	 *  �����������洢Ԫ�أ��洢��Ԫ����Ҫ�鿴����ô����Ҫ������������
	 * 
	 */

	public static void main(String[] args) {
//		demo1();
		Collection c =new ArrayList();
		c.add(new Student("����",23));//��Object obj1 = new Student("����",23);
		c.add(new Student("����",24));
		c.add(new Student("����",25));
		c.add(new Student("����",26));
		//��ȡ������
		Iterator it = c.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			Student s = (Student)it.next();
			System.out.println(s.getName()+"..."+s.getAge());
		}
	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		//�����е�Ԫ�ؽ��е�����������
		Iterator it = c.iterator();//��ȡ������
//		boolean b1 =it.hasNext();//�жϼ������Ƿ���Ԫ�أ����򷵻�true
//		Object obj1 = it.next();//���Խ�ָ������ƶ�һλ
//		System.out.println(b1);
//		System.out.println(obj1);
//		
//		boolean b2 =it.hasNext();//�жϼ������Ƿ���Ԫ�أ����򷵻�true
//		Object obj2 = it.next();
//		System.out.println(b2);
//		System.out.println(obj2);
	
		while(it.hasNext()) {
			Object b2 = it.next();
			System.out.println(b2);
		}
	}

}
