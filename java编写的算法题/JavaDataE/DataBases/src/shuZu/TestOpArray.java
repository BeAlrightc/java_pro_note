package shuZu;

import java.util.Arrays;

public class TestOpArray {
	//������Ҫ����Ϊһ���������һ��Ŀ��Ԫ�صĲ���

	public static void main(String[] args) {
		// �������ĳ��Ȳ��ɱ������
		int arr[]= new int[] {9,8,7};
		//���ٲ鿴�����е�Ԫ��
		System.out.println("arr�����������ڵ�Ԫ��Ϊ��"+Arrays.toString(arr));
		//Ҫ���������Ŀ��Ԫ��
		int dst =6;
		
		//����һ�����飬������ԭ���鳤�ȼ�һ
		int[] newArr = new int[arr.length+1];
		
		//��ԭ�����е�����ȫ�����Ƶ������鵱��ȥ
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}		
		System.out.println("ԭ���鸴�ƹ���֮����������е�ֵΪ��"+Arrays.toString(newArr));
		//�ٰ�Ŀ��Ԫ�ط��뵽��������
		newArr[arr.length] = dst;
		//�������滻ԭ����
		arr = newArr;
		//��arr�����ӡ����
		System.out.println("���滻��������еĸ���ֵΪ��"+Arrays.toString(arr));

	}

}
