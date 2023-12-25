package Chazhao;

import java.util.Arrays;

public class SelectSortFu {

	public static void main(String[] args) {
		int [] arr = new int[] {2,5,4,7,9,1,2,7,8};
		System.out.println(Arrays.toString(arr));
		Select(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void Select(int [] arr) {
		for(int i =0;i<arr.length;i++) {
			int minIndex = i;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex = j;
				}
			}
			if(i !=minIndex) {//Èç¹û
				int temp =arr[i];
				arr[i] =arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

}
