package Chazhao;

import java.util.Arrays;
 
public class QuickPaiU {

	public static void main(String[] args) {
		int [] arr = new int[] {2,6,7,9,3,45,8,1};
		System.out.println(Arrays.toString(arr));
		QuickPai(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void QuickPai(int[]arr,int start,int end) {
		//start��end���±�
		if(start<end) {
			int stard = arr[start];
			int low = start;
			int high = end;
			while(low<high) {
				while(low<high&&stard<arr[high]) {
					high--;
				}
				//��������һ����highλ�õ�����stardС�Ļ����͵���λ��
				arr[low]=arr[high];
				//�������ʼ������lowλ�ϵ�����
				while(low<high&&arr[low]<stard) {
					low++;
				}
				arr[high]=arr[low];
			}
			arr[low]=stard;
			QuickPai(arr,start,low);
			QuickPai(arr,low+1,end);
	   }
	}
}
