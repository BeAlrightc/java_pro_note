import java.util.HashSet;
import java.util.Set;

public class e7 {
/*
 * ������ѧ��ά��(N.Wiener)�������죬11������˴�ѧ��������1935~1936��Ӧ�����й��廪��ѧ��ѧ��

һ�Σ����μ�ĳ����Ҫ���飬�������������עĿ����������ѯ���������䣬���ش�˵��

��������������Ǹ�4λ�����������4�η��Ǹ�6λ������10���������ð����˴�0��9��10�����֣�ÿ����ǡ�ó���1�Ρ���

��������һ�£�����ʱ�����ж����ᡣ

 */
	public static void main(String[] args) {
		for(int i = 0;i<19;i++) {
			int i1 =i*i*i;
			int i2 =i1*i;
			String s1 =i1+"";
			String s2 =i2+"";
			if(s1.length()==4&&s2.length()==6&&check(s1+s2)) {
				System.out.println(i);
				break;
				
			}
			
		}

	}

	private static boolean check(String s) {
		Set<Character> c = new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			c.add(s.charAt(i));
		}
		return c.size()==10;
	}

}
