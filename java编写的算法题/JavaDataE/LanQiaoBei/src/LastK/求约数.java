package LastK;

public class ��Լ�� {
	/*
	 * ��78120�ж��ٸ�Լ��
	 */

	public static void main(String[] args) {
		int count=0;
		int a=78120;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {//��a�Ƿ��ܹ�������һ������������Ծ�����a��Լ��
				count++;
			}
		}
		System.out.println(count);

	}

}
