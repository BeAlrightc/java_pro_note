package Themes;

import java.util.HashSet;
import java.util.Set;

public class ������rise {
	/*
	 * ������ѧ��ά��(N.Wiener)�������죬11������˴�ѧ��������1935~1936��Ӧ�����й��廪��ѧ��ѧ��

һ�Σ����μ�ĳ����Ҫ���飬�������������עĿ����������ѯ���������䣬���ش�˵��

��������������Ǹ�4λ�����������4�η��Ǹ�6λ������10���������ð����˴�0��9��10�����֣�ÿ����ǡ�ó���1�Ρ���

��������һ�£�����ʱ�����ж����ᡣ
	 */
		

		public static void main(String[] args) {
			for(int i =0;i<100;i++) {
				int i1 =i*i*i;//����һ������˵�����η�
				int i2 =i1*i;//����һ������˵���Ĵη�
				//����������ת��Ϊ�ַ���
				String s1 =i1+"";
				String s2 =i2+"";
				//��������
				if(s1.length() ==4&&s2.length()==6&&check(s1+s2)) {
					System.out.println("��������Ϊ:"+i);
					break;
				}
			}

		}
		private static boolean check(String s) {
			//����һ�����ϣ�����ȥ��
			Set<Character> set =new HashSet<Character>();//����һ��Set��������ȥ��
			for(int i=0;i<s.length();i++) {
				//���ַ���
				set.add(s.charAt(i));
			}
			return set.size()==10;
		}

	}


