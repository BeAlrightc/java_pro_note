package Chazhao;

public class TestSearch {

	public static void main(String[] args) {
		// Ŀ������
		int [] arr = new int[] {2,3,5,6,8,4,9,0};
		//Ŀ��Ԫ��
		int target = 2;
		//Ŀ��Ԫ�����ڵ��±�
		int index =-1;
		//��������
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==target) {
				index =i;
				break;
			}
		}
		//��ӡĿ��Ԫ�ص��±�
		System.out.println("index:"+index);
	}

}
