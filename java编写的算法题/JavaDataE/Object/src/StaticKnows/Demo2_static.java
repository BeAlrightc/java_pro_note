package StaticKnows;

public class Demo2_static {

	public static void main(String[] args) {
//		Demo d = new Demo();
//		d.print();
		Demo.print2();
	}

}
/*
 * A:static ��ע������
 * 	a:�ھ�̬��������û��this�ؼ��ֵ�
 * 	�������أ�
 * 		��̬����������ض����أ�this�����Ŷ���Ĵ���������
 * 		��̬�ȶ����ȴ���
 * 	b:��̬����ֻ�ܷ��ʾ�̬�ĳ�Ա�����;�̬�ĳ�Ա����
 * 		��̬������
 * 			��Ա������ֻ�ܷ��ʾ�̬����
 * 			��Ա������ֻ�ܷ��ʾ�̬��Ա����
 * 		�Ǿ�̬������
 * 			��Ա�����������Ǿ�̬�ģ�Ҳ�����ǷǾ�̬��
 * 			��Ա�����������Ǿ�̬�ĳ�Ա������Ҳ�����ǷǾ�̬�ĳ�Ա������
 * �򵥼ǣ�
 * ��ֻ̬�ܷ��ʾ�̬
 */
class Demo{
	int num1 = 10;//�Ǿ�̬�ĳ�Ա����
	static int num2 = 20;//��̬�ĳ�Ա����
	
//	public void print() {//�Ǿ�̬�ĳ�Ա����,�ȿ��Է��ʾ�̬��Ҳ���Է��ʷǾ�̬��
//		System.out.println(num1);
//		System.out.println(num2);
//	}
	
	public static void print2() {//��̬�ĳ�Ա����
		//System.out.println(num1);��̬�������ܷ��ʷǾ�̬��Ա����
		System.out.println(num2);
	}                                                                           
}