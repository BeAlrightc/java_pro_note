package DiGui;

public class ��ӡi��j {

	public static void main(String[] args) {
           f2(2,10);
	}
	
	public static void f2(int i,int j) {
		if(i>j) {//���i>j�Ļ�����ֹ��ӡ
			return;
		}
		System.out.println(i);
		f2(i+1,j);//�������÷���
	}
}
