package collectionLists;

import java.util.ArrayList;
import java.util.Collection;

import bean.Student;


public class demo3 {
	/*
	 * A:���ϵı���
	 * 	��ʵ�������λ�ȡ�����е�ÿһ��Ԫ��
	 * ������
	 * 		������ת�������飬����ʵ�ֱ������ϵı���
	 * toArrray()
	 */

	
	
	public static void main(String[] args) {
		//demo1();
		Collection c = new ArrayList();
		c.add(new Student("����",23));
		c.add(new Student("����",24));
		c.add(new Student("����",25));
		c.add(new Student("��6",26));
		Object[]  arr =c.toArray();
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			Student s = (Student)arr[i];//ǿ��ת����Student����
			System.out.println(s.getName() + "..."+s.getAge());
		}
		

	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		Object [] arr =c.toArray();//������ת��������
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
