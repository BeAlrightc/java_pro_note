package PaiXuSuanFa;

import java.util.Arrays;

//���������㷨
public class QuikPai {
	
	

	public static void main(String[] args) {
		int[] arr = new int[] {3,4,6,7,2,7,2,8,0};
		System.out.println(Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	public static void quickSort(int[]arr,int start,int end) {
		//start��endֻ����λ���±�
		if(start<end) {
			//�������еĵ�0��������Ϊ��׼��
			int stard = arr[start];
			//��¼��Ҫ������±��һ������ߵ�������һ�����ұߵ���������������������arr[low]>arr[high]ʱ�������ͽ���λ�ã�Ȼ�����
			//������ȥ,���ֳ������� 
			int low =start;
			int high = end;
			//ѭ���ұȱ�׼�������ͱȱ�׼��С����
			while(low<high) {
				//�ұߵ����ֱȱ�׼����
				while(low<high&&stard<=arr[high]) {
					high--;
				}
				//ʹ���ұߵ������滻��ߵ�����
				arr[low]=arr[high];
				//�����ߵ����ֱȱ�׼��С
				while(low<high&&arr[low]<=stard) {
					low++;
				}
				arr[high]=arr[low]; 
			}
			//�ѱ�׼�������������ڵ�λ��Ԫ��
			arr[low]=stard;
			//�������бȻ�׼��С������
			quickSort(arr,start,low);
			//�������бȻ�׼���Ĵ������
			quickSort(arr,low+1,end);
		}
		//��ʼλ�õ��ڽ���λ��ʱ�Ͳ���Ҫ�ݹ��� 
		
	}

}
