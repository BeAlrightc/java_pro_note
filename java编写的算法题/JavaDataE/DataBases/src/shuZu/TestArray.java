package shuZu;

public class TestArray {

	public static void main(String[] args) {
		//����һ������
		int [] arr1 = new int[3];
		//��ȡ����ĳ���
		int length1 = arr1.length;
		System.out.println("arr1 's lenght"+length1);
		//���������Ԫ�أ�������[�±�]��ע���±���㿪ʼ��������ȡ�����ȼ�һ
		int element0 = arr1[0];
		System.out.println("element0's value is :"+element0);
		//Ϊ�����е�Ԫ�ظ�ֵ
		arr1[0] =99;
		System.out.println("element0:"+arr1[0]);
		arr1[1]=98;
		arr1[2]=97;
		//��������,�����ƺ��������������������
		for(int i =0;i<length1;i++) {
			System.out.println("arr1 element"+i+":"+arr1[i]);
		}
		//���������ͬʱΪ�����Ԫ�ظ�ֵ
		int [] arr2 = new int[] {90,80,70,60,50};
		//��ȡ����ĳ���
		System.out.println("arr2's length:"+arr2.length);
	}

}
