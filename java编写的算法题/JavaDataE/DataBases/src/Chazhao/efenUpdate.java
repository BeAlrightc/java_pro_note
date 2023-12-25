package Chazhao;

import java.util.Arrays;

public class efenUpdate {
	 public static void main(String[] args) {
	        /**
	         * 二分法查找是有一个前提，就是这个数据的顺序必须是从小到大
	         * 执行的效率减半
	         */
	        int[] arr = new int[]{1,3,5,7,8,2,4};
	        Arrays.sort(arr);//执行之前先把数组进行排序，用sort方法 
	        System.out.println(Arrays.toString(arr));
	        int target = 1; //查找的目标值
	        int index = -1; //目标值得下标
	        int begin = 0;  //头部的下标
	        int end = arr.length-1; //尾部
	        int mid = (begin+end)/2;  //二分下标
	        int i =0;
	        while (i< arr.length){ //循环查找
	            if (arr[mid]==target){ //判断中间这个值是不是要查找的元素
	                index=mid;
	                break;
	            }else {//中间这个元素不是要查找的元素
	                if (arr[mid]>target){ //中间这个元素大于要查找的元素
	                    end=mid-1;
	                }else {//中间这个元素小于这个元素
	                    begin=mid+1;
	                }
	            }
	            mid = (begin+end)/2;
	            i++;
	        }
	        System.out.println("index="+index);//index=2
	    }

}
