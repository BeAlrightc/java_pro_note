package TanXin;

public class �ݹ���ϰ {

	public static void main(String[] args) {
		int[] we = new int[] {1,2,3,4,5,6,7,8,9,11};
		int y =A(we,0);
		int A=B(5);
		int S=C(5);
		
		System.out.println(S);
		System.out.println(A);
		System.out.println(y);
		System.out.println(Reverse("abcdef", 5));
		WER(4,10);
		hannuoTa(3,'A','B','C');

	}
	//�ý׳�������Ԫ�صĺ�
	public static int A(int[] arr,int begin) {
		if(begin==arr.length-1) {
			return arr[begin];
		}
		return arr[begin]+A(arr,begin+1);
	}
	//��׳�
	public static int B(int N) {
		if(N==1) {
			return 1;
		}
		return N*B(N-1);
	}
	//���ۼӺ�
	public static int C(int M) {
		if(M==0) {
			return 0;
		}
		return M+C(M-1);
	}
	//��ת�ַ�
	public static String Reverse(String src,int end) {
		if(end==0) {
			return ""+src.charAt(0);
		}
		return ""+src.charAt(end)+Reverse(src,end-1);
	}
	//��i��ʼ��ӡ��j
	public static void WER(int i,int j) {
		if(i>j) {
			return;
		}
		System.out.println(i);
		WER(i+1,j);
	}
	//��ŵ��
	public static void hannuoTa(int S,char A,char B,char C) {
		//����
		if(S==1) {
			System.out.println("����1�����Ӵ�"+A+"�ƶ���"+C);
		}else {
		//�Ƚ����е������Ƶ��м�
		hannuoTa(S-1,A,C,B);
		System.out.println("����"+S+"�����Ӵ�"+A+"�ƶ���"+C);
		hannuoTa(S-1,B,A,C);
		
		
	}
	}

}
