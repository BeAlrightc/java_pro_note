package Chazhao;

import java.util.Arrays;

public class insert {


	public static void main(String[] args) {
		int [] arr = new int[] {1,4,5,7,3,4,2,9};
		System.out.println(Arrays.toString(arr));
		insert(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void insert(int[] arr) {
		//遍历除第一个的所有元素
		for(int i=1;i<arr.length;i++) {
			//如果当前数字比前一个数字小
			if(arr[i]<arr[i-1]) {
				//将当前的数字存起来
				int temp = arr[i];
				int j;
				//遍历这个数之前的所有元素、
				for(j=i-1;j>=0&&temp<arr[j];j--) {
					//把前一个数字付给后一个数字
					arr[j+1]=arr[j];
				}
				//把临时变量付给不满足条件的后一个变量
				arr[j+1]=temp;
			}
		}
		
		
	}
}
