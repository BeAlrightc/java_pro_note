package suanFa;
//�ݹ����������
public class TestRecursive {

	public static void main(String[] args) {
		print(10);

	}
	//�ݹ鷽��
	public static void print(int i) {
		if(i>0) {
		System.out.print(i+" ");
		print(i-1);//�ֵ�����һ��print����
	}
	}
}
