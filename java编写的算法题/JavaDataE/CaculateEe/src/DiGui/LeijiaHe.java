package DiGui;

public class LeijiaHe {
	/*
	 * ע�����
	 * 1���ݹ鷽�������г���
	 * 2��ÿ�εݹ���ñ�����С��Χ��ֻ���������ܴﵽ��������
	 */

	public static void main(String[] args) {
		int n = sum(11,100);
		int m = sum_recursion(1,10);
		int j = JieChe(1,5);
		
		System.out.println(j);
	}
	
	//����ѭ��ʵ���ۼӺ�
	public static int sum(int start,int end) {
		
		//�����Ϸ���У��
		if(start>=end) {
			return -1;//����-1ִ��ʧ��
		}
		//����һ�������洢�ۼ�
		int sum =0;
		//��start��end
		for(int i =start;i<=end;i++) {
			sum +=i;
		}
		return sum;
	}
	
	//�ݹ鷽����������ۼӺͣ������ص� 
	public static int sum_recursion(int start,int end) {
		//�ݹ鷽���ĳ���
		if(start==end) {
			return start;
		}
		//�ݹ����
		//ÿ�εݹ���ö�Ҫ��С��Χ��Ŀ����ܴﵽ���ڵ�����
		
		return start +sum_recursion(start+1,end);
	}
	//�׳˵ݹ�
	public static int JieChe(int start,int end) {
		//���úó���
		if(start==end) {
			return start;
		}
		return start* JieChe(start+1,end);
	}

}
