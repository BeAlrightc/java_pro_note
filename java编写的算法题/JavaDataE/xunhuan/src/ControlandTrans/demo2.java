package ControlandTrans;
/*
 * 
 */

public class demo2 {

	public static void main(String[] args) {
//		demo1();
//		demo2();
		/*
		 * �����ڿ���̨���2�Σ�"java������"
		 * �����ڿ���̨���7�Σ�"java������"
		 * �����ڿ���̨���13�Σ�"java������"
		 */
for(int x=1;x<=10;x++) {
	if(x%3==0) {
		//break;
//		continue;
		System.out.println("java������");
	}
	System.out.println("java������");
}
	}

	private static void demo2() {
		System.out.println("��Һ�");
		http://www.heima.com http:��������һ���Ϸ��ı�ʶ��
			System.out.println("������ĺ�");
	}

	private static void demo1() {
		outer:for(int i =1;i<=10;i++) { //a���Ǳ�ţ�ֻҪ�ǺϷ���ʶ������
			System.out.println("i="+i);
			inner:for(int j =1;j<=10;j++) {
				System.out.println("j ="+j);
				break outer;
			}
		}
	}

}
