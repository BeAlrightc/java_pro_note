package collectionLists;

import java.util.ArrayList;
import java.util.Collection;

import bean.Student;

public class demo2_collection {
	/*
	 * collection���ϵ�ʹ��
	 * add���������List����һֱ������true,��ΪList�����ǿ��Դ���ظ�Ԫ�ص�
	 * �����set���ϵ��洢Ԫ�ص�ʱ��ͻ᷵��false
	 * ArrayList�ĸ���ĸ�����дtoString�����������ڴ�ӡ��������õ�ʱ������Ľ������Object���е�toString
	 */

	public static void main(String[] args) {
		//demo1();
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		c.add("e");
		System.out.println(c);
		System.out.println(c.size());
		//c.remove("b");//ɾ��ָ��Ԫ��
		//c.clear();//��ռ���
	
		//System.out.println(c.contains("b"));
		System.out.println(c.isEmpty());
	}

	private static void demo1() {
		@SuppressWarnings("rawtypes")
		Collection c = new ArrayList();//��������ָ�����
		
		boolean b1 = c.add("abc");
		boolean b2 = c.add(true);//�Զ�װ�� new Boolean(true)
		boolean b3 = c.add(100);
		boolean b4 =c.add(new Student("����",23));
		boolean b5 = c.add("abc");

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		System.out.println(c);
	}
	

}
