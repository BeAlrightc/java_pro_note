package jdk5;

import java.util.ArrayList;

import bean.Person;

public class Demo5_ArrayListArraylist {
	/*
	 * ��ʾ��
	 * ����Ƕ��֮ArrayListǶ��ArrayList
	 * ����
	 * ����ѧ�ƣ�ѧ���ַ�Ϊ���ɸ��༶
	 * ����ѧ����һ���󼯺�	
	 * ���ɸ��༶��Ϊÿһ��С����
	 */

	public static void main(String[] args) {
	ArrayList<ArrayList<Person>> list = new ArrayList<>();

		ArrayList<Person> first  =new ArrayList<>();//������һ���༶
		first.add(new Person("����",30));
		first.add(new Person("�����",33));
		first.add(new Person("������",20));
		
		ArrayList<Person> second = new ArrayList<>();
		second.add(new Person("������",31));
		second.add(new Person("��ޱ",33));
		second.add(new Person("����",32));
		//���༶��ӵ�ѧ��
		list.add(first);
		list.add(second);		
		
		//����ѧ�Ƽ���
		for(ArrayList<Person> a : list) {//�õ�һ��С���ϼ���
			for(Person p : a) {//����С�����е�Ԫ��
				System.out.println(p);
			}
		}
	}

}
