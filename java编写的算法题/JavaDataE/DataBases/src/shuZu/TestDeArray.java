package shuZu;

import java.util.Arrays;

public class TestDeArray {
	//此类用于将数组中的一个元素进行删除

	public static void main(String[] args) {
		//目标数组
		int[] arr = new int[] {9,8,7,6,5,4};
		//要删除的元素的下标
		int dst =2;
		System.out.println("删除之前："+Arrays.toString(arr));
		//1.创建一个新的数组，长度为原数组减一
		int[] newArr = new int[arr.length-1];
		//2.复制原数组除了要删除的那个元素以外其他的元素
		for(int i=0;i<newArr.length;i++) {
			//要删除的元素之前的元素
			if(i<dst) {
				newArr[i] =arr[i];
				//要删除的元素之后的元素
			}else {
				newArr[i] = arr[i+1];
			}
		}
		//3.新数组替换就数组
		arr =newArr;
		//打印数组的内容
		System.out.println("删除之后:"+Arrays.toString(arr));
	}
	
}
