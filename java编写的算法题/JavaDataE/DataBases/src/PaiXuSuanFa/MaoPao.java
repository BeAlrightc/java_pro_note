package PaiXuSuanFa;

import java.util.Arrays;

public class MaoPao {
	//冒泡排序

	public static void main(String[] args) {
		int[] arr = new int[] {5,7,2,9,4,1,0,5,7};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	//冒泡排序
	/*5,7,2,9,4,1,0,5,7 共需要比较length-1轮
	 * 5,7,2,9,4,1,0,5,7
	 * 5,2,7,9,4,1,0,5,7
	 * 5,2,7,4,1,0,5,7,9当第一轮比完后
	 */
	public static void bubbleSort(int[] arr) {
		//控制共比较多少轮（该数组长度减一的长度）
		for(int i=0;i<arr.length-1;i++) {
			//控制比较的次数
			for(int j =0;j<arr.length-1-i;j++) {
				//交换顺序
				 if(arr[j]>arr[j+1]) {
					 int tem=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=tem;	 
				 }
			}
		}
	}

}
