package SetList;

import java.util.LinkedHashSet;

public class Demo2_LinkedHashSet {
	/*
	 * LinkedHashSet�ĵײ�������ʵ�ֵģ�
	 * ����Set������Ψһһ���ܱ�֤��ô�����ôȡ�ļ��϶���
	 * ��Ϊ��HashSet�����࣬����Ҳ�Ǳ�֤Ԫ��Ψһ�ģ���HashSet��ԭ��һ��
	 */

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("a");
		lhs.add("a");
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		System.out.println(lhs);

	}

}
