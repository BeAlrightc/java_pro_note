package LastK;

import java.util.HashSet;
import java.util.Set;

public class ������2 {
	/*
	 * ������ѧ��ά��(N.Wiener)�������죬11������˴�ѧ��������1935~1936��Ӧ�����й��廪��ѧ��ѧ��

һ�Σ����μ�ĳ����Ҫ���飬�������������עĿ����������ѯ���������䣬���ش�˵��

��������������Ǹ�4λ�����������4�η��Ǹ�6λ������10���������ð����˴�0��9��10�����֣�ÿ����ǡ�ó���1�Ρ���

��������һ�£�����ʱ�����ж����ᡣ*/

	public static void main(String[] args) {
	for(int i=0;i<=150;i++) {//��һ��forѭ�����б�������������������Ϊ150��
		int a=i*i*i;
		int b=a*i;
		String a1=a+"";//ת��Ϊ�ַ���
		String b1=b+"";
		if(a1.length()==4 && b1.length()==6 && check(a1+b1)) {//��check�����ж������Ƿ�Ϊʮλ��
			System.out.println(i);
			break;
		}
	}
	}

	private static boolean check(String c) {
		Set<Character> c1 = new HashSet<Character>();//����һ��Set��������ȥ��
		for(int i=0;i<c.length();i++) {
			c1.add(c.charAt(i));
		}
		return c1.size()==10;
	}

}
