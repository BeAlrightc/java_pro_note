package themes;

import java.util.Arrays;
//�ҳ����鵱���ظ���Ԫ�ز���ӡ����
import java.util.Random;

import javax.rmi.CORBA.Util;

public class FindS {

	public static void main(String[] args) {
		int N=11;
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		//���һ������Ϊ�����
		arr[arr.length-1]=new Random().nextInt(N-1)+1;
		//����±�
		int index =new Random().nextInt(N);
		System.out.println(Arrays.toString(arr));
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		//������λ���㽫���ҳ���
		int x1 =0;
		for(int i=1;i<=N-1;i++) {
			x1=(x1^i);
		}
		for(int i=0;i<N;i++) {
			x1=x1^arr[i];
		}
		System.out.println(x1);
		
		//�ø����ռ�ķ��������ҳ���
		System.out.println("=========");
		int[] helper = new int[N];//����һ�����飬����ΪN��
		for(int i=0;i<N;i++) {
			helper[arr[i]]++;//arr[N]����Ȼ����Ϊÿһ����Ȼ���±����ֵ������1
		}
		for(int i=0;i<N;i++) {
			if(helper[i]==2) {//������ĳ����Ȼ���±����2��ʱ���������Ȼ���±���Ƕ����
				System.out.println(i);
				break;
			}
		}
	}

}
