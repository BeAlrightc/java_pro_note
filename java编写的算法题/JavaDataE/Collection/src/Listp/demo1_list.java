package Listp;

import java.util.ArrayList;
import java.util.List;

public class demo1_list {
	/*
	 * void add(int index,E element)
	 * E remove(int index)
	 * E get(int index)
	 * E set(int index,E element)
	 */

	public static void main(String[] args) {
//		demo2();
//		demo1();
//		demo3();
//		demo4();
		List list =new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.set(1, "z");//���ƶ�λ�õ�Ԫ���޸�Ϊһ���µ�
		System.out.println(list);
	}

	private static void demo4() {
		List list =new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		//Object obj1 = list.get(0);//ͨ������ֵ��ȡ�����е�ĳ1��Ԫ��
		//System.out.println(obj1);
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

	private static void demo3() {
		List list =new ArrayList();
		list.add(111);
		list.add(222);
		list.add(333);
		
		list.remove(111);//ɾ����ʱ�򲻻��Զ�װ�䣬��������������
		System.out.println(list);
	}

	private static void demo1() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Object obj = list.remove(1);//ͨ������ɾ��Ԫ�أ�����ɾ����Ԫ�ط���
		System.out.println(obj);
		System.out.println(list);
	}

	private static void demo2() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(1,"e");  //index <=size�����ᱨ������index>=0
		//list.add(6,"r");//����������������ʱ�ͳ���������ֵ�쳣
		
		System.out.println(list);
	}

}
