package jdk5;
//��̬����
import static java.util.Arrays.sort;
import static java.util.Arrays.toString;

public class Demo2_StaticImport {
	/*
	 * A.��̬�������
	 * ��̬�����еľ�̬����
	 * B.��ʽ
	 *  import static ����...��������������
	 *  ����ֱ�ӵ��뵽�����ļ���
	 *  C��ע������
	 *  ���������Ǿ�̬�ģ�������ͬ���ľ�̬���������ײ�֪��ʹ��˭�����ʱ��Ҫʹ�ã������ǰ׺���ɴ˿ɼ������岻������һ�㲻��
	 *  ��̬���뿪�����ã�������Ҫ���Ķ�
	 */

	public static void main(String[] args) {
		int[] arr = {55,22,33,44,11};
		sort(arr);//��������������
		//System.out.println(toString(arr));

	}

}
