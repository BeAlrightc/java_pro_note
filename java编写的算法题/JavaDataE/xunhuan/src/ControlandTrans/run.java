package ControlandTrans;

public class run {
	/*
	 * С��Ҫ��һ���ܲ�ѵ����
��ʼʱ��С����������������ֵ��Ϊ 10000�����С���ܲ���ÿ�������
600 �����������С����Ϣ��ÿ�������� 300 ����������������ĺ����Ӷ���
���ȱ仯�ġ�
С��������һ���ӡ���Ϣһ���ӡ�����һ���ӡ�����Ϣһ���ӡ������ѭ
�������ĳ��ʱ��С������������ 0������ֹͣ������
����С���ڶ�ú�ֹͣ������Ϊ��ʹ��Ϊ������������Ϊ��λ����𰸡�
	 */

	public static void main(String[] args) {
		int power=10000;
		int i=0;
		while(power>=600) {
			power-=600;
			power+=300;
			i++;
		}
		System.out.println(i);
		System.out.println(power);
		System.out.println(i*2*60+400/10);

	}

}
