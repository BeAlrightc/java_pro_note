package themes2;

public class �ܲ� {
	/*
	 * ����㷨�е���
	 * С��Ҫ��һ���ܲ�ѵ����
��ʼʱ��С����������������ֵ��Ϊ 10000�����С���ܲ���ÿ�������
600 �����������С����Ϣ��ÿ�������� 300 ����������������ĺ����Ӷ���
���ȱ仯�ġ�
С��������һ���ӡ���Ϣһ���ӡ�����һ���ӡ�����Ϣһ���ӡ������ѭ
�������ĳ��ʱ��С������������ 0������ֹͣ������
����С���ڶ�ú�ֹͣ������Ϊ��ʹ��Ϊ������������Ϊ��λ����𰸡�
run:ÿ��10
xiu:ÿ��5
	 */
	static int power = 10000;

	public static void main(String[] args) {
		int sum = 0;//ͳ�����˶��ʱ�䣨���ӣ�
		boolean juge = true;
		for (int i = 1;; i++) {
			if(power < 600&&juge ) {
				break;
			}
			//�ܲ�
			if(i % 2 != 0 && juge) {
				power -= 600;
				juge = false;
			}else {	//��Ϣ
				power += 300;
				juge = true;
			}
			sum++;
		}
		System.out.println(sum * 60 + power / 10);
	}

}