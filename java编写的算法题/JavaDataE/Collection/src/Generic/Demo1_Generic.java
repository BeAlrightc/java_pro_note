package Generic;

import java.util.ArrayList;
import java.util.Iterator;

import bean.Person;

public class Demo1_Generic {
	/*
	 * A:���͸���
	 * B�����͵ĺô�
	 * 		1.��߰�ȫ��1���������ڵĴ���ת���������ڣ�
	 * 		2.ʡȥǿת���鷳
	 * C.���͵Ļ���ʹ��
	 * <>�зŵı�����������������
	 * D:����ʹ�õ�ע������
	 *   ǰ��ķ��ͱ���һ�£����ߺ���ķ��Ϳ���ʡ�Բ�д��jdk1.7�����������η��ͣ�
	 *   <>����ŵ����޶���������
	 */

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
//		list.add(110);
//		list.add(true);
		list.add(new Person("����",23));
		list.add(new Person("����",24));
		Iterator<Person> it =list.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			//Person p = (Person)it.next();//ǿת
			//next����ֻ�ܵ���һ����������ö�λὫָ������ƶ����
			//System.out.println(it.next().getName()+"..."+it.next().getAge());
		Person p = it.next();
		System.out.println(p.getName()+"...."+p.getAge());
			
		}
	}

}
