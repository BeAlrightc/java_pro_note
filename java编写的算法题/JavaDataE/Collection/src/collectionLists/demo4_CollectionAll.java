package collectionLists;

import java.util.ArrayList;
import java.util.Collection;

public class demo4_CollectionAll {/**
	 * ������ʾ��
	 * 		��All�Ĺ�����ʾ
	 * 		boolean addAll(Collection c)//��һ�����ϵ��е�Ԫ����ӵ���һ�����ϵ���
	 * 		boolean removeAll(Collection c)//ɾ����������֮��Ľ���Ԫ��
	 * 		boolean containsAll(Collection c)//�鿴һ�������Ƿ������һһ�������е�ȫ��Ԫ��
	 * 		boolean retainAll(Collection c)//ȡ����
	 */

	public static void main(String[] args) {
//		demo1();
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList(); //alt +shift+R���Ը���
//		c2.add("a");
//		c2.add("b");
		c2.add("f");
		
		
		//boolean b = c1.containsAll(c2);//�鿴c1�Ƿ����c2��Ԫ��
		
		//ȡ������������õļ��ϸı�ͷ���true��������õļ��ϲ���ͷ���false
		boolean b = c1.retainAll(c2);//ȡ����
		System.out.println(b);
		System.out.println(c1);
		System.out.println(c2);

	}

private static void demo1() {
	Collection c1 = new ArrayList();
	c1.add("a");
	c1.add("b");
	c1.add("c");
	c1.add("d");
	
	Collection c2 = new ArrayList(); //alt +shift+R���Ը���
	c2.add("a");
	c2.add("b");
	c2.add("c");
	c2.add("d");
	
	c1.addAll(c2);//��c2��ÿһ��Ԫ����ӵ�c1��
	//c1.add(c2);//��c2����һ��������ӵ�c1��
	
	System.out.println(c1);
}

}
