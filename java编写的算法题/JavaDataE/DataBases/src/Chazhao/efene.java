package Chazhao;

import java.util.Arrays;

public class efene {

	public static void main(String[] args) {
		int[] arr = new int[] {1,3,4,7,8,9,6,5};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		erfen(5,arr);
		

	}
	public static void erfen(int target,int[] arr) {
		int index =-1;
		int begin =0;
		int end =arr.length-1;
		int mid = (begin+end)/2;
		int i =0;
		while(i<arr.length) {
			if(arr[mid]==target) {
				index=mid;
				break;
			}else {
				if(arr[mid]>target) {
					end =mid-1;
				}else {
					begin=mid+1;
				}
			}
			mid=(begin+end)/2;
			i++;
		}
		System.out.println("Ë÷ÒıÖµÎª£º"+index);
		
	}

}
