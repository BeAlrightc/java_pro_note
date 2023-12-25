package PaiXuSuanFa;

import java.util.Arrays;

//快速排序算法
public class QuikPai {
	
	

	public static void main(String[] args) {
		int[] arr = new int[] {3,4,6,7,2,7,2,8,0};
		System.out.println(Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	public static void quickSort(int[]arr,int start,int end) {
		//start和end只代表位置下标
		if(start<end) {
			//把数组中的第0个数字作为标准数
			int stard = arr[start];
			//记录需要排序的下标就一个在左边的索引，一个在右边的索引，当两个索引遇到arr[low]>arr[high]时两个数就交换位置，然后继续
			//继续下去,最后分成两部分 
			int low =start;
			int high = end;
			//循环找比标准数大的书和比标准数小的数
			while(low<high) {
				//右边的数字比标准数大
				while(low<high&&stard<=arr[high]) {
					high--;
				}
				//使用右边的数字替换左边的数字
				arr[low]=arr[high];
				//如果左边的数字比标准数小
				while(low<high&&arr[low]<=stard) {
					low++;
				}
				arr[high]=arr[low]; 
			}
			//把标准基数赋给低所在的位置元素
			arr[low]=stard;
			//处理所有比基准数小的数字
			quickSort(arr,start,low);
			//处理所有比基准数的大的数字
			quickSort(arr,low+1,end);
		}
		//开始位置等于结束位置时就不需要递归了 
		
	}

}
