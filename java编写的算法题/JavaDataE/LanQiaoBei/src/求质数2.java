
public class ������2 {

	public static void main(String[] args) {
//		System.out.println("0~100֮���������");
//		for(int i=0;i<=100;i++) {//����
//			if(check(i)==true)
//			System.out.print(i+" ");
//		}
System.out.println(check(5));
	}
	public static boolean check(int number) {
		int flag=0;//����һ����־
		
		if(number==1||number==0) {//�˷��������ų�1��0��Ӱ��
			return false;//����false
		}
		for(int i=2;i<number;i++) {//��һ��forѭ��
			if(number%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==1) {//��־����
			return false;
		}else {
			return true;
		}
	}

}
