package Chazhao;

import java.util.Arrays;

public class MaoPaoTest {

	public static void main(String[] args) {
		int [] arr = new int[] {1,3,6,5,3,8,9,6,0};
		System.out.println(Arrays.toString(arr));
		mao(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void Maopao(int [] arr) {
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=0;j<arr.length-1-i;j++) {
//				if(arr[j]>arr[j+1]) {
//					int tem = arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=tem;
//				}
//			}
//		}
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int tem = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tem;
				}

			}
		}
	}

public static void mao(int[] arr) {
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
			int tem = arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=tem;
		}
	}
}
}
}

