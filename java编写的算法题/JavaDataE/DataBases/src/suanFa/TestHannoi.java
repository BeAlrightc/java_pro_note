package suanFa;

public class TestHannoi {
	//�˴����ǹ��ں�ŵ�������ӵĴ��루�ݹ���ã�

	public static void main(String[] args) {  
		hanoi(3 ,'A','B','C');

	}
	/*
	 * @param n ����N������
	 * @param from ��ʼ������
	 * @param  in �м������
	 * @param  to Ŀ������
	 * �����ж��ٸ����ӣ�����Ϊֻ���������ӡ�������������Ӻ�������һ������
	 * �ܵĹ�����˵�������Ƚ����е������Ƶ��м��Ǹ����ӵ���Ȼ���ٽ������Ƶ�Ŀ��Ϊ���
	 */
	public static void hanoi (int n,char from,char in,char to) {
		//ֻ��һ�����ӣ��ݹ���ֹ��������
		if(n==1) {
			System.out.println("��1�����Ӵ�"+from+"�Ƶ�"+to);
			//�����ж��ٸ����ӣ�����Ϊֻ���������ӡ�������������Ӻ�������һ������
		}else {
			//��һ���ƶ��������е����ӵ��м�λ�ã���һ��λ�ã���������������Ŀ��λ�ã�
			hanoi(n-1,from,to,in);
			//�ƶ����������
			System.out.println("��"+n+"�����Ӵ�"+from+"�Ƶ�"+to);
			//�ڶ������������е����Ӵ��м�λ���Ƶ�Ŀ��λ��
			hanoi(n-1,in,from,to);
			
		}
	}

}
