package PaiXuSuanFa;

import java.util.Arrays;

public class ShellSort {
	//ϣ������

	public static void main(String[] args) {
		int[] arr = new int[] {3,5,2,7,8,1,2,0,4,7,4,3,8};
		System.out.println("����֮ǰ��"+Arrays.toString(arr));
		ShellSort(arr);
		System.out.println("����֮��"+  Arrays.toString(arr));
	}
	public static void ShellSort(int[] arr) {
		int k=1;
		//�������еĲ���
		for(int d=arr.length/2;d>0;d/=2) {
			//�������е�Ԫ��
			for(int i =d;i<arr.length;i++) {
				//�������������е�Ԫ��
				for(int j =i-d;j>=0;j-=d) {
					//�����ǰԪ�ش��ڼ��ϲ�������Ǹ�Ԫ�أ���Ҫ����λ�ò���
					if(arr[j]>arr[j+d]) {
						int temp = arr[j];
						arr[j]=arr[j+d];
						arr[j+d]=temp;
			  		}
				}
				
			}
			System.out.println("��"+k+"��������"+Arrays.toString(arr));
			k++;
		}
	}
}
