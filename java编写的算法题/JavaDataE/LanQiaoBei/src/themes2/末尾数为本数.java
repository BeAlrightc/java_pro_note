package themes2;

public class ĩβ��Ϊ���� {
	/*
	 * ��Щ���ֵ�������ĩβ�����Ǹ����ֱ���
���磺1,4,5,6,9,24,25,��

�������һ�£���10000���ڵ������У�ָ�����֣����������������ֵ�����������������������һ���ж��ٸ���

���ύ����������Ҫ��д�κζ�������ݡ�
	 */

	public static void main(String[] args) {
		int count=0;//����һ��������
//		int yu =1;//���ܽ����������ڴ˴����г�ʼ��
	for(int i=1;i<=10000;i++) {
		String n = i+"";//ת��Ϊ�ַ�������
		int yu =1;//��yu���ڴ˴����г�ʼ����ÿ��ѭ������֮�󶼻��Ϊ1
		for(int j=0;j<n.length();j++) {//�������ֻ��Ϊ����yud��ֵ
			yu*=10;
		}
		if(i==Math.pow(i,3)%yu) {
			count ++;
		}
//		System.out.println("hi"); 
	}
	System.out.println(count);
	}

}
