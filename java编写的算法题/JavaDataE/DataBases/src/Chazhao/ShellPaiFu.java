package Chazhao;

import java.util.Arrays;

public class ShellPaiFu {

	public static void main(String[] args) {
		int [] arr = new int[] {1,7,5,8,2,9,0,23,56};
		System.out.println(Arrays.toString(arr));
		Shell(arr);
		System.out.println(Arrays.toString(arr));
		
		}
	public static void Shell(int[] arr) {
		for (int d=arr.length/2;d>0;d/=2) {
			for(int i=d;i<arr.length;i++) {
				for(int j=i-d;j>=0;j-=d) {
					if(arr[j]>arr[j+d]) {
						int temp = arr[j];
						arr[j]=arr[j+d];
						arr[j+d]=temp;
					}
				}
			}
		}
	}
	

}
