package shuZu;

import java.util.Arrays;

public class TestDeArray {
	//�������ڽ������е�һ��Ԫ�ؽ���ɾ��

	public static void main(String[] args) {
		//Ŀ������
		int[] arr = new int[] {9,8,7,6,5,4};
		//Ҫɾ����Ԫ�ص��±�
		int dst =2;
		System.out.println("ɾ��֮ǰ��"+Arrays.toString(arr));
		//1.����һ���µ����飬����Ϊԭ�����һ
		int[] newArr = new int[arr.length-1];
		//2.����ԭ�������Ҫɾ�����Ǹ�Ԫ������������Ԫ��
		for(int i=0;i<newArr.length;i++) {
			//Ҫɾ����Ԫ��֮ǰ��Ԫ��
			if(i<dst) {
				newArr[i] =arr[i];
				//Ҫɾ����Ԫ��֮���Ԫ��
			}else {
				newArr[i] = arr[i+1];
			}
		}
		//3.�������滻������
		arr =newArr;
		//��ӡ���������
		System.out.println("ɾ��֮��:"+Arrays.toString(arr));
	}
	
}
