package LastK;

public class λ����� {
	/*
	 * С������λ�к��� 2��0��1��9 �����ֺܸ���Ȥ��
	 * �� 1 �� 40 ������������ �� 1��2��9��10 �� 32��39 �� 40��
	 * �� 28 �������ǵĺ��� 574�� ���ʣ��� 1 �� 2019 �У��������������ĺ��Ƕ��٣�
	 */

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=2019;i++) {
			String a=i+"";
			if(a.contains("2")|| a.contains("0") || a.contains("1") || a.contains("9") ) {
				sum +=i;
				
			}
		}
		System.out.println(sum);
	}

}
