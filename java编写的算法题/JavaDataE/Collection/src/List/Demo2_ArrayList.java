package List;

import java.util.ArrayList;
import java.util.Iterator;

import bean.Person;

public class Demo2_ArrayList {
	/*
	 * A:������ʾ��
	 *   ����ArrayListȥ���������Զ������Ԫ�ص��ظ�ֵ�������Ա����ֵ��ͬ��
	 * B��ע������
	 * 		��дequals()������
	 * contains�����ж��Ƿ�������ײ���������equals����
	 *
	 */

	public static void main(String[] args) {
		ArrayList list = new ArrayList();//�������϶���
		list.add(new Person("����",23));
		list.add(new Person("����",23));
		list.add(new Person("����",24));
		list.add(new Person("����",24));
		list.add(new Person("����",24));
		list.add(new Person("����",24));
		
		ArrayList newlist=getSingle(list);
		System.out.println(newlist);
		list.remove(new Person("����",23));
		System.out.println(list);
	}

	public static ArrayList getSingle(ArrayList list) {
		 ArrayList newList = new ArrayList<>();
		 
		 Iterator it =list.iterator();//��ȡ������
		 while(it.hasNext()) {
			 Object obj = it.next();
			 if(!newList.contains(obj)) {
				 newList.add(obj);
			 }
		 }
		 return newList;
	}
}
