package SetList;

import java.util.HashSet;

import bean.Person;

public class Demo1_HashSet {
	/*
	 * Set���ϣ����������������ظ������򣨴�ȡ��һ�£�
	 * ֻҪ����ʹ�õ����������ľͿ���ʹ����ǿforѭ�����б���
	 */

	public static void main(String[] args) {
//		demo1();
		HashSet<Person> hs = new HashSet<>();//�����༯��
		hs.add(new Person("����",24));
		hs.add(new Person("����",24));
		hs.add(new Person("����",24));
		hs.add(new Person("����",24));
		hs.add(new Person("����",24));
		hs.add(new Person("����",24));
		System.out.println(hs);
		
	}

	private static void demo1() {
		HashSet<String> hs = new HashSet<>();
		boolean b1=hs.add("a");
		boolean b2=hs.add("a");//�򼯺�������ظ�Ԫ�ط���false
		hs.add("b");
		hs.add("c");
		hs.add("d");
		
		System.out.println(hs);//HashSet�̳���ϵ����дtoString����
		System.out.println(b1);
		System.out.println(b2);//�ظ���ֵ
		for (String string : hs) {//ʹ����ǿforѭ�����е���
			System.out.println(string);
		}
	}

}
