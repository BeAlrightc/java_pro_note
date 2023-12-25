package PaiXuSuanFa;

import java.util.Arrays;

import demo05.MyQueue;



public class RedixQueueSort {
	//��������
	//�е�����
	public static void main(String[] args) {
		int[] arr = new int[] {23,6,189,45,9,287,56,1,798,34,65,652,5};
		redixSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void redixSort(int[] arr) {
		//����������������
		int max = Integer.MIN_VALUE;//�Ƚ�����������Ϊ����Integer��С����
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		//������������Ǽ�λ��һ����ý���תΪ�ַ����ķ��������ַ����ĳ���
		int maxLength = (max+"").length();
		//������ʱ�洢���ݵĶ���
		MyQueue[] temp = new MyQueue[10]; 
		//Ϊ�������鸳ֵ
		for(int i =0;i<temp.length;i++) {
			temp[i]= new MyQueue();
		}
		//������󳤶ȵ��������ȽϵĴ���
		for(int i =0,n=1;i<maxLength;i++,n*=10) {
			//��ÿһ�����ֱַ��������
			for(int j=0;j<arr.length;j++) {
				//��������
				int ys=arr[j]/n%10;
				//�ѵ�ǰ���������ݷ���ָ���Ķ�����
				temp[ys].add(arr[j]);
			}
			//��¼ȡ��Ԫ����Ҫ�ŵ�λ��
			int index =0;
			//�����ж����е�����ȡ����
			for(int k=0;k<temp.length;k++) {			
				//ѭ��ȡ��Ԫ��
				while(!temp[k].isEmpty()) {
					//ȡ������
					arr[index]=temp[k].poll();
					//��¼��һ��λ��
					index++;
				}
			}	
		}
	}

}
