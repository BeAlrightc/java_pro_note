package SetList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Test3 {
	/*
	 * ���󣺽������е��ظ�Ԫ��ȥ��
	 * 
	 * ������
	 * 1.����List���ϴ洢���ɸ��ظ�Ԫ��
	 * 2.�������巽��ȥ���ظ�
	 * 3.��ӡһ��list����
	 */

	public static void main(String[] args) {
		//1.����list���ϴ洢���ɸ��ظ�Ԫ��
		ArrayList<String> list =new ArrayList<>();
            list.add("a");
            list.add("a");
            list.add("a");
            list.add("b");
            list.add("b");
            list.add("b");
            list.add("c");
            list.add("c");
            list.add("c");
            //�������巽��ȥ���ظ�
            getSigleList(list);
            //3.��ӡһ��List����
            System.out.println(list);
	}
	/*
	 * ������
	 * ȥ��list�����е��ظ�
	 * 1.����һ��LinkedHashset����
	 * 2.��liST�����е����е�Ԫ����ӵ�LinkHashSet����
	 * 3.��list�����е�Ԫ�����
	 * 4����LinkedHashSet�����е�Ԫ����ӻ�List������
	 */
	public static void getSigleList(List<String> list) {
		//����һ��HashSet����
		LinkedHashSet<String>lhs =new LinkedHashSet<>();
	//��list�����е�Ԫ����ӵ�LinkedHashSet���ϵ���
		lhs.addAll(list);
		//��list�����е�Ԫ�����
		list.clear();
		//��lhsȫ�����뵽list����
		list.addAll(lhs);
	}

}
