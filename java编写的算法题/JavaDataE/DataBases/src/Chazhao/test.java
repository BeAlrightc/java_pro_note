package Chazhao;

public class test {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		//����һ��Ŀ��Ԫ��
		int target = 1;
		//����һ����ʼԪ��
		int begin =0;
		//��¼���һ��Ԫ��
		int end =arr.length-1;
		//����һ���м�λ��
		int mid = (begin+end)/2;
		//����Ŀ��Ԫ�ص�����ֵ
		int index =-1;
		//ѭ������
		while(true) {
			if(arr[mid]==target) {//����ƥ�����
				index =mid;
				break;
			}else {
				if(arr[mid]>target) {//����м��Ԫ�ر�Ŀ��Ԫ�ش�
					end = mid-1;//���¶���ĩβֵ
				}else {//����м�Ԫ��С��Ŀ��Ԫ��
					begin = mid +1;//���¶��忪ʼֵ
				}
				//����ȡ���м�ֵ
				mid=(begin+end)/2;
			}
		}
		System.out.println("Ŀ��Ԫ�ص�����ֵΪ��"+index);

	}

}
