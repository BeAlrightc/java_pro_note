package ShuZu;

import java.util.Arrays;

public class Arry1 {
	/*
	 * 如何增加数组中的元素
	 * 1）先创立一个新数组
	 * 2）将老数组的元素加进新数组里面
	 * 3）其余的元素自己家此处加一个9
	 */

	public static void main(String[] args) {
		int[] arry = new int[] {6,7,8};
		//创建一个新数组，其长度为老数组的加一
		int[] newArry = new int[arry.length+1];
		System.out.println("未添加之前的数组："+Arrays.toString(arry));
		int dst = 9;
		for(int i =0;i<arry.length;i++) {
			//将原数组加入到新数组当中
			newArry[i]=arry[i];
		}
		//将目标元素加入到新数组当中
		newArry[arry.length]=dst;//此处arry.lenth是新数组的最后后一个元素，为什么？第一个元素从零开始算起
		//新数组替换原数组
		arry=newArry;
		//输出数组的值
        System.out.println("添加之后的数组："+Arrays.toString(arry));
	}

}
