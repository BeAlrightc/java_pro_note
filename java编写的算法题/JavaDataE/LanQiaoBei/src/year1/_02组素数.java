package year1;

import java.util.HashSet;
import java.util.Set;

/*
 * ��1949��4�����ֿ�Ƭ������ڷ����ǵ��Ⱥ�˳�򣬲��ܵ���
 * ��������ɶ��ٸ�4λ������
 */
//�����ж����������ɣ�ɸ�������������ֽ�
//���ظ�Ԫ�ص�ȫ���У��Ӽ��
public class _02������ {
	static void f(int [] arr,int k) {
		if(k==4)//ǰ�涼��ȷ��
			check(arr);
		for(int i=k;i<4;i++) {
			//����
			int t =arr[k];
			arr[k]=arr[i];
			arr[i]=t;
			f(arr,k+1);
			
			 t =arr[k];
			arr[k]=arr[i];
			arr[i]=t;
		}
	}
	static Set<Integer> set = new HashSet<Integer>();
	
	private static void check(int[] arr) {
		int x =arr[0]*1000+arr[1]*100+arr[2]*10+arr[3];
		boolean flag =true;
		for(int i=2;i<=Math.sqrt(x);i++) {
			if(x%i==0) {
				flag =false;
				break;
			}
			if(flag) set.add(x);
		}
	}

	public static void main(String[] args) {
		int [] arr = {1,4,9,9};
		f(arr,0);
		System.out.println(set.size());

	}

}
