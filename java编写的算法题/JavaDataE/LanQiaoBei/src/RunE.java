
public class RunE {
	/*
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

	public static void main(String[] args) {
		int power = 10000;
		int times =0;
		while(power>600) {
			power-=600;
			power+=300;
			times++;
			System.out.println(times);
			System.out.println(power);
		}
		System.out.println(times*2*60+power/10);

	}

}
