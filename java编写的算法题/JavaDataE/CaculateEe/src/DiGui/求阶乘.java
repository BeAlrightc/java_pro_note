package DiGui;

public class ��׳� {

	public static void main(String[] args) {
		int y = Jie(5);
		System.out.println(y);

	}
	/*
	 * ���ظ�
	 * n*(n-1)�Ľ׳ˣ���ԭ������ظ�����ͬ���ڹ�ģ��С
	 */
	public static int Jie(int n) {
		//������ֹ����
		if(n==1) {
			//��nΪ1��ʱ�򷵻�1
			return 1;
		}
		return n*Jie(n-1);//������������
	}

}
