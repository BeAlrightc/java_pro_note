package PaiXuSuanFa;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		int [] arr = new int[] {3,4,5,7,1,2,0,3,6,8};
		System.out.println(Arrays.toString(arr));
		SelectSort(arr);
		System.out.println(Arrays.toString(arr));
		 

	}
	//ѡ������
	public static void SelectSort(int [] arr) {
		//�������е��� 
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			//�ѵ�ǰ���������ͺ������е���һ�ν��бȽϣ�����¼����С����
			for(int j =i+1;j<arr.length;j++) {
				//�������Ƚϵ����ȼ�¼������С����С
				if(arr[minIndex]>arr[j]) {
					//��¼����С���Ǹ������±�
					minIndex=j;					
				}
			}
			//�����С�����͵�ǰ��������һ��,˵���±�minIndex�����ȵ�ǰ����������С��
			if(i !=minIndex) {
				int temp = arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]= temp;
			}
			//Ȼ���Ǹ���λ�þͲ��ٸı䣬�ͽ��к�������Ƚ���
		}
	}
}
  