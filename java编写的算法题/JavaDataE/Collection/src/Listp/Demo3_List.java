package Listp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo3_List {
	/*
	 * A��������ʾ��
	 * ��������һ�����ϣ����ʣ������ж�������û�С�World�����Ԫ�أ�������Ҿ����һ��JavaeeԪ�أ�code
	 */

	public static void main(String[] args) {
		List list = new ArrayList();//���ڼ�����ֻ�ܷŶ����������µ��ַ�����������ΪObject��
		list.add("a");//�൱�� Object obj = new String();
		list.add("b");
		list.add("c");
		list.add("world");
		list.add("d");
		//����1,ʹ������forѭ������
		/*
		for(int i =0;i<list.size();i++) {
			if(list.get(i)=="world") {
				list.add("javaee");
			}
			System.out.println(list.get(i));
		}
		*/
		//����2,ʹ�õ���������
		/*
		Iterator  it  = list.iterator();//��ȡ������
		while(it.hasNext()) {//�жϼ������Ƿ���Ԫ��
			String str =(String) it.next();//����ת��
			if("world".equals(str)) {//��������ʱ
				list.add("javaee");//�˲���Ϊ������ͬʱ�����ӣ���Ϊ�����޸�ConcurrentModificationException
			}
		}
		*/
		ListIterator lit = list.listIterator();//��ȡ��������list�ռ������еģ�
		while(lit.hasNext()) {
			String str = (String)lit.next();
			if("world".equals(str)) {
				//list.add("javaee");�ô˷�ʽ��Ȼ�ᱨ�쳣
				lit.add("javaee");
			}
		}
		System.out.println(list);
	}

}
