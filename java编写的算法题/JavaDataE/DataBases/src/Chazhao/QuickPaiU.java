package Chazhao;

import java.util.Arrays;
 
public class QuickPaiU {

	public static void main(String[] args) {
		int [] arr = new int[] {2,6,7,9,3,45,8,1};
		System.out.println(Arrays.toString(arr));
		QuickPai(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void QuickPai(int[]arr,int start,int end) {
		//start和end是下标
		if(start<end) {
			int stard = arr[start];
			int low = start;
			int high = end;
			while(low<high) {
				while(low<high&&stard<arr[high]) {
					high--;
				}
				//倘若遇到一个在high位置的数比stard小的话，就调换位置
				arr[low]=arr[high];
				//调换完后开始处理在low位上的数，
				while(low<high&&arr[low]<stard) {
					low++;
				}
				arr[high]=arr[low];
			}
			arr[low]=stard;
			QuickPai(arr,start,low);
			QuickPai(arr,low+1,end);
	   }
	}
}
