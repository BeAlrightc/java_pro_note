package LastK;

public class lan2016_2 {
	/*
	 * ú����Ŀ
	 */

	public static void main(String[] args) {
		int count=0;//�ܵ�ú����
		int you=0;//ÿ��ú�����Ŀ
		for(int i=1;i<=100;i++) {
			 you +=i;
			 count +=you;
		}
System.out.println(count);
	}

}
