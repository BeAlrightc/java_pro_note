package LanQiaoBei;

import java.util.HashSet;
import java.util.Set;

public class GuessAge {
	//�����ǣ�һ���˵���������η���һ����λ���������Ĵη���һ����λ������10�����ְ�����0-9���е����֣�����������

	public static void main(String[] args) {
		for(int i =0;i<100;i++) {
			int i1 =i*i*i;//����һ������˵�����η�
			int i2 =i1*i;//����һ������˵���Ĵη�
			//����������ת��Ϊ�ַ���
			String s1 =i1+"";
			String s2 =i2+"";
			//��������
			if(s1.length() ==4&&s2.length()==6&&check(s1+s2)) {
				System.out.println(i);
				break;
			}
		}

	}
	private static boolean check(String s) {
		//����һ�����ϣ�����ȥ��
		Set<Character> set =new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			//���ַ���
			set.add(s.charAt(i));
		}
		return set.size()==10;
	}

}
