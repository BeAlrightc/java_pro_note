package DiGui;
//쳲�����������
public class FeiBoNaQie {

	public static void main(String[] args) {
//		feiBO(8);
		FeiBOd(1);

	}
	
	//�ݹ鷽��ʵ��쳲��������
	/*
	 * �������÷���
	 * 1������
	 * ��������������ݵĸ�����Ϊ��������
	 * ��һ������Ϊindex��ʾ��ţ���1��ʼ��ÿ�εݹ������index����1����index�������е�����ʱ�ﵽ����(��ֹ�ݹ����)
	 * 
	 * 2��ÿ�εݹ�i���ñ�����С��Χ
	 * �����Կ������е����ݸ������֣�ÿ�ε�����ŵ�ֵ������1�����к����е�����֮��Ϊ0��1��1��2
	 * 
	 */
	//Ϊ����ʹ�ã��������·���,�˷���Ϊ��������
	
	public static void FeiBOd(int num) {
		//�Ϸ���У��
		if(num<1) {
			return ;//ִ��ʧ�ܣ�return ;���֮��һ��;�ž���ֹ����ִ��
		}else {
			//���õݹ鷽��
			FeiBOdd(1,num,0,1);
		}
		
	}
	
	
	//���ڵݹ鷽���������û���ʹ�ã�����Ϊ˽��
	/*
	 * index ���ݵ����
	 * num �������ݵĸ���
	 * one ��һ����
	 * two �ڶ�����	 
	 * */
	private static void FeiBOdd(int index,int num,int one,int two) {
		
		//����,�����ݵ���Ŵ������ݵĸ�����ʱ��ֹͣ���ã��ݹ��ս�
		if(index>num) {
			return ;
		}
		if(index ==1) {
		System.out.println(0);	
		System.out.println(1);	
		}
		//��������Ϊǰ������֮��
		System.out.println(one+two);
		//ԭ���ڶ�������ɵ�һ����
		FeiBOdd(++index,num,two,one+two);
	}
	
	
	
	//ѭ������ʵ��쳲���������
	//numΪ�����쳲�������ĸ�������numΪ1��ʱ�����������Ϊ0��1��1��
	//��numΪ2��ʱ�����������Ϊ0��1��1��2
public static void feiBO(int num) {
	//�Ϸ���У��
	if(num<1) {
		return ;//ִ��ʧ�ܣ�return ;���֮��һ��;�ž���ֹ����ִ��
	}
	//��һ���������������ݵĸ���
	int n =0;
	
	//��һ����
	int a =0;
	
	//�ڶ�����
	int b =1;
	
	//��������Ϊ������֮��
	int c =0;
	
	do {
		n++;
		if(n==1) {
			System.out.println(0);
			System.out.println(1);
		}
		//��������Ϊǰ������֮��
		c =a+b;
		System.out.println(c);
		//ԭ���ĵڶ�����Ϊ��һ������
		a=b;
		//ԭ���ĵ���������Ϊ�ڶ�����
		b=c;
	}while(n<num);
 }

	
}
