package Chazhao;

import java.util.Arrays;

public class insert {


	public static void main(String[] args) {
		int [] arr = new int[] {1,4,5,7,3,4,2,9};
		System.out.println(Arrays.toString(arr));
		insert(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void insert(int[] arr) {
		//��������һ��������Ԫ��
		for(int i=1;i<arr.length;i++) {
			//�����ǰ���ֱ�ǰһ������С
			if(arr[i]<arr[i-1]) {
				//����ǰ�����ִ�����
				int temp = arr[i];
				int j;
				//���������֮ǰ������Ԫ�ء�
				for(j=i-1;j>=0&&temp<arr[j];j--) {
					//��ǰһ�����ָ�����һ������
					arr[j+1]=arr[j];
				}
				//����ʱ�������������������ĺ�һ������
				arr[j+1]=temp;
			}
		}
		
		
	}
}
