package themes3;

public class ������� {
	/*
	 * ����ķ�������ʱ�������ڹ̶������֡�

����㣬Ҫ���������룬��ȷ��С�����5λ��С��λ����Ĳ�0��

����д�ø�������������д�κζ�������ݡ�
	 */

	public static void main(String[] args) {
		System.out.printf("%.5f",F(1));

	}

	private static double F(double n) {
		if(n>=100) {//���ڿ����Լ��趨��ӦΪ�������������������һ������ȷ������
			return n;
		}else {
			return n/(n+F(n+1));//��ϸ�۲�ͼƬ���ҵ�ʽ�ӹ���
		}
	}
}
