package DiGui;

public class ��ת�ַ��� {
	//��������ַ����������

	public static void main(String[] args) {
		System.out.println(reverse("abcde",4));

	}
 
	public static String reverse(String src,int end) {
		if(end==0) {//���ַ�����0��ʱ�򷵻ص�һ���ַ�
			return ""+src.charAt(0);
		}
		return src.charAt(end)+reverse(src,end-1);
	}
}
