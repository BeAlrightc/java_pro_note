package Themes;

public class ������ {
	/*
	 * С�����������òμ�Ԫ���ƻᡣ���������Ƕ���ˣ����ǵ�Ƥ��˵����������������֮��������֮�͵�6������
	 * С���ֲ���˵�������ǿɲ���˫��̥�������϶�Ҳ������8�갡����
            ����д����С���Ľ�С�����õ����䡣
	 */
	public static void main(String[] args) {
		demo1();
		}


	private static void demo1() {
		for(int i=0;i<=100;i++){
			for(int j=i;j<=i+8;j++) {
				if(i*j==6*(i+j)) {
					System.out.println(i+" "+j);
				}
			 }
			}
	}

}
