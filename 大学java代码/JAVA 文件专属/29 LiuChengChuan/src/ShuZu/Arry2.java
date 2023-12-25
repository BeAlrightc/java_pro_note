package ShuZu;

import java.util.Arrays;

public class Arry2 {

	public static void main(String[] args) {
		int[] arry =new int[] {4,5,6,7,8}; 
		System.out.println("删除之前的数组："+Arrays.toString(arry));
		//要删除的目标元素下标
		int index =2;
		//新建一个数组
		int[] newArry = new int[arry.length-1];
		//弄一个循环，，将原数组符合条件的加进新数组当中
		for(int i = 0;i<newArry.length;i++) {
			if(i<index) {//在下标元素之前
				newArry[i] =arry[i];
			}else {//下标元素之后
				newArry[i]=arry[i+1];
			}
		}
		//新数组替换老数组
		arry = newArry;
		//输出新数组
		System.out.println("删除之后的数组："+Arrays.toString(arry));

	}

}
