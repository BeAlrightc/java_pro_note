package DiGui;

public class 쳲��������� {

	public static void main(String[] args) {
		int Y=Fei(2);
		System.out.println(Y);
	}
	//i��ʾ����
	public static int Fei(int i) {
		if(i==1||i==2) {//�ڵ�һ��͵ڶ����1
			return 1;
		}
		
		return Fei(i-1)+Fei(i-2);
	}

}
