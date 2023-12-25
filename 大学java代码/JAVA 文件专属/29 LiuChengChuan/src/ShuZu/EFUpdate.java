package ShuZu;

import java.util.Arrays;

public class EFUpdate {

	public static void main(String[] args) {
		int[] arry = new int[] {1,2,3,4,5,6,7,8,9}; 
	
		
		System.out.println(erw(arry,9));
		

	}
	public static int erw(int[]arry,int dst) {
		int begin=0;
		int end = arry.length-1;
		while(begin<=end) {
			int mid =(begin + end)/2;
			if(arry[mid]==dst) {
				return mid;
			}else {
				if(arry[mid]<dst) {
					begin = mid +1;
				}else {
					end = mid-1;
				}
			}
			
		}
		return -1;
	}
}

