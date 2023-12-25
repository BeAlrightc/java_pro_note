package PaiXuSuanFa;

import java.util.Arrays;

public class ShellSort {
	//希尔排序

	public static void main(String[] args) {
		int[] arr = new int[] {3,5,2,7,8,1,2,0,4,7,4,3,8};
		System.out.println("排序之前："+Arrays.toString(arr));
		ShellSort(arr);
		System.out.println("排序之后："+  Arrays.toString(arr));
	}
	public static void ShellSort(int[] arr) {
		int k=1;
		//遍历所有的步长
		for(int d=arr.length/2;d>0;d/=2) {
			//遍历所有的元素
			for(int i =d;i<arr.length;i++) {
				//遍历本组中所有的元素
				for(int j =i-d;j>=0;j-=d) {
					//如果当前元素大于加上步长后的那个元素，就要交换位置操作
					if(arr[j]>arr[j+d]) {
						int temp = arr[j];
						arr[j]=arr[j+d];
						arr[j+d]=temp;
			  		}
				}
				
			}
			System.out.println("第"+k+"次排序结果"+Arrays.toString(arr));
			k++;
		}
	}
}
