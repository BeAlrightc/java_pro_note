package shuZu;

import java.util.Arrays;

public class TestOpArray {
	//此类主要讲解为一个数组添加一个目标元素的操作

	public static void main(String[] args) {
		// 解决数组的长度不可变的问题
		int arr[]= new int[] {9,8,7};
		//快速查看数组中的元素
		System.out.println("arr数组中所存在的元素为："+Arrays.toString(arr));
		//要加入数组的目标元素
		int dst =6;
		
		//创建一个数组，长度是原数组长度加一
		int[] newArr = new int[arr.length+1];
		
		//把原数组中的数据全部复制到新数组当中去
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}		
		System.out.println("原数组复制过来之后的新数组中的值为："+Arrays.toString(newArr));
		//再把目标元素放入到数组的最后
		newArr[arr.length] = dst;
		//新数组替换原数组
		arr = newArr;
		//将arr数组打印出来
		System.out.println("被替换后的数组中的各个值为："+Arrays.toString(arr));

	}

}
