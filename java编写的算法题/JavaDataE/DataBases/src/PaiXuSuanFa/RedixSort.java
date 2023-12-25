package PaiXuSuanFa;

import java.util.Arrays;

public class RedixSort {
	//基数排序

	public static void main(String[] args) {
		int[] arr = new int[] {23,6,189,45,9,287,56,1,798,34,65,652,5};
		redixSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void redixSort(int[] arr) {
		//存数组中最大的数字
		int max = Integer.MIN_VALUE;//先将最大的数设置为整数Integer最小的数
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		//计算最大数字是几位数一般采用将其转为字符串的方法，求字符串的长度
		int maxLength = (max+"").length();
		//用于临时存储数据的数组
		int[][] temp = new int[10][arr.length];  
		//用于纪录在temp中相应的数组中存放的数字的数量
		int[] counts=new int[10];
		//根据最大长度的数决定比较的次数
		for(int i =0,n=1;i<maxLength;i++,n*=10) {
			//把每一个数字分别计算余数
			for(int j=0;j<arr.length;j++) {
				//计算余数
				int ys=arr[j]/n%10;
				//把当前遍历的数据放入指定的数组中
				temp[ys][counts[ys]] =arr[j];
				//记录数量
				counts[ys]++;
			}
			//记录取的元素需要放的位置
			int index =0;
			//把数字取出来
			for(int k=0;k<counts.length;k++) {
				//记录数量的数组中当前余数记录数量不为0
				if(counts[k]!=0) {
				//循环取出元素
					for(int l=0;l<counts[k];l++) {
						//取出元素
						arr[index]=temp[k][l];
						//记录下一个位置
						index++;
					}
					//把数量置空，置为0
					counts[k]=0;
				}
			//打印操作 
//			if(i==0) {
//				for(int[] nums:temp) {
//					System.out.println(Arrays.toString(nums));
//				}
//				System.out.println(Arrays.toString(counts));
			}
		}
	
	}

}
