package PaiXuSuanFa;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		int [] arr = new int[] {3,4,5,7,1,2,0,3,6,8};
		System.out.println(Arrays.toString(arr));
		SelectSort(arr);
		System.out.println(Arrays.toString(arr));
		 

	}
	//选择排序
	public static void SelectSort(int [] arr) {
		//遍历所有的数 
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			//把当前便利的数和后面所有的数一次进行比较，并记录下最小的数
			for(int j =i+1;j<arr.length;j++) {
				//如果后面比较的数比记录的数最小的数小
				if(arr[minIndex]>arr[j]) {
					//记录下最小的那个数的下标
					minIndex=j;					
				}
			}
			//如果最小的数和当前遍历数不一致,说明下标minIndex的数比当前遍历的数更小。
			if(i !=minIndex) {
				int temp = arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]= temp;
			}
			//然后那个数位置就不再改变，就进行后面的数比较了
		}
	}
}
  