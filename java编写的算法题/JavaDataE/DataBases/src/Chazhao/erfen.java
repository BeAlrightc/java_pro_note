package Chazhao;

public class erfen {
	//����㷨�����⣬���Ҫ���ҵ�Ŀ��Ԫ�ز��ڸ���������Ļ��������ѭ��

	public static void main(String[] args) {
		//Ŀ������
		int[] arr = new int[] {1,2,3,4,5,6,7,8};
		//Ŀ��Ԫ��
		int target =9;
		//��¼��ʼλ��
		int begin =0;
		//��¼������λ��
		int end = arr.length-1;
		//��¼�м��λ��
		int mid =(begin+end)/2;
		//��¼Ŀ��Ԫ�ص�λ��
		int index =-1;
		//ѭ�����ң�������ѭ����ȥ
		while(true) {
			//�ж��м��Ԫ���ǲ���Ҫ���ҵ�Ԫ��
			if(arr[mid]==target) {
				index =mid;
				break;
				//�м����Ԫ�ز���Ҫ���ҵ�Ԫ��
			}else {
				//�ж��м�����Ԫ���ǲ��Ǳ�Ŀ��Ԫ�ش�
				if(arr[mid]>target) {
					//�ѽ���λ�õ����м�λ�õ�ǰһ��λ��
					end = mid-1;
					//�м�Ԫ�ر�Ŀ��Ԫ��С
				}else {
					//�ѿ�ʼλ�õ������м��һ��λ��
					begin =mid+1;
					
				}
				//ȡ���µ��м�λ��
				mid = (begin+end)/2;
			}
		}
		System.out.println("index��ֵΪ��"+index);

	}

}
 