package experiment;

public class class2 {
	//++qΪǰ�õ������ʽ�����ɣ����Լ��ٷ���ԭֵ
	//q++Ϊ���õ������ʱ   ���ɣ��ȷ���ԭֵ���Լ�
	//ͨ������ʵ��

	public static void main(String[] args) {
	     method1();
         method2();
         method3();
	}

	private static void method3() {
		int q=10;
         int f = q++ + ++q; //1.q=11,q++=10 2.q=12 ++q=12  => f=10+12=22
         System.out.println(f);//�����ֵΪ22
	}

	private static void method2() {
		int q=10;
         q++; //����ʹ�õ�ʱ��q=11,++q=11 ���߲��޲��
         int m = q++ + 2;//  ���ݹ��ɣ��ȷ���ԭֵ���Լ� ����ʱq=12 ,q++=11  ���� m=11+2=13
         System.out.println(m);//�����ֵΪ 13
	}

	private static void method1() {
		int q=10;
		++q;//��ʱ��q=11,++q=11 ���߲��޲��
		int m =++q + 2 ; //��++q������ֵ��ӵ�ʱ�� ��ʱq=12,++q=12 q��ֵ��++q��ֵͬ������ ����  => m= 12+2=14
		System.out.println(m); //�����ֵΪ 14
	}

}
