package PaiXuSuanFa;

import java.util.Arrays;

public class InsertPai {
	//��������

	public static void main(String[] args) {
		int [] arr = new int[] {5,3,2,8,5,9,1,0};
		System.out.println(Arrays.toString(arr));
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
		public static void insertSort(int[] arr) {
			//�������е����� �ӵ�2�����ֿ�ʼ����
			for(int i =1;i<arr.length;i++) {
				//�����ǰ���ֱ�ǰһ������С
				if(arr[i]<arr[i-1]) {
					//�ѱ������ִ�����
					int temp = arr[i];
					int j;
					//������ǰ���ֵ���������
					for( j=i-1;j>=0&&temp<arr[j];j--) {
						 //��ǰһ�����ָ�����һ������
						arr[j+1]=arr[j];
					}
					//����ʱ���������forѭ���ĵ�ǰԪ�أ����������������ĺ�һ��Ԫ��
					arr[j+1]=temp;
				}
			}
		}
}
