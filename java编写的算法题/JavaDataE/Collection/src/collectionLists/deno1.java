package collectionLists;

import bean.Student;

public class deno1 {
	/**
	 * A:������ʾ
	 * :��5��ѧ��������5��ѧ������Ϣ�洢�������У������������飬��ȡ��ÿһ��ѧ������Ϣ
	 * @param args
	 */

	public static void main(String[] args) {
		//int [] arr = new int[s]; //��������������������
		Student [] arr =new Student[5];//��������������������
		arr[0] =new Student("����",23); //����һ��ѧ������ �洢������ĵ�һ��λ��
		arr[1] =new Student("����",23);//����һ��ѧ������ �洢������ĵڶ���λ��
		arr[2] =new Student("����",23);//����һ��ѧ������ �洢������ĵ�����λ��
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
 