package jdk5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo4_AsList {
	/**
	 * 
	 * ����ת���ɼ���
	 * ����ת���ɼ�����Ȼ�������ӻ����Ԫ�أ����ǿ����ü��ϵ�˼��������飬Ҳ����˵����ʹ�ü����������������
	 */

	public static void main(String[] args) {
//		demo1();
      //demo2();
		//����ת���棬�ӷ��͵�
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		String [] arr = list.toArray(new String[10]);//������ת��Ϊ���飬����ĳ���С�ڼ��ϵ�sizeʱ��ת��������ĳ��ȵ��ڼ��ϵ�size
		//�������ĳ��ȴ���size,��������鳤����ָ���ĳ���һ��
		
		for (String string : arr) {
			System.out.println(string);
		}
	}

	private static void demo2() {
		//		int[] arr = {11,22,33,44,55};
		//		List<int[]>list = Arrays.asList(arr);//�����������͵�����ת����һ�����ϣ��Ὣ�������鵱��һ���������ת��
				//System.out.println(list);
		 Integer [] arr= {11,22,33,44,55};
		 List<Integer> list=Arrays.asList(arr);//����ת���ɼ��ϣ����������������������
		 System.out.println(list);
	}

	private static void demo1() {
		String [] arr= {"a","b","c"};
		List<String> list = Arrays.asList(arr);//������װ���ɼ���
		//list.add("d");//�������
		System.out.println(list);
	}

}
