package Chazhao;

import java.util.Arrays;

public class select {
	/** ֱ��ѡ������ */
	public static void selectSort(int[] data) {
		int i, j, small;
		int temp;
		for (i = 0; i < data.length - 1; i++) {
			small = i;
			for (j = i+1; j < data.length; j++) { //Ѱ����С������Ԫ��
				if (data[j] < data[small]) {
					small = j; // ��¼��С������Ԫ��
				}
			}
			if (small != i) { // ��������Ԫ��
				temp = data[i];
				data[i] = data[small];
				data[small] = temp;
			}
		}
	}	

	public static void main(String[] args) {
		int [] arr = {12,56,4,89,32,11,3 };
		System.out.println(Arrays.toString(arr));
		selectSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
