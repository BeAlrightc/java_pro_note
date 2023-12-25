package ShuZu;

import java.util.Arrays;

public class array3 {

	public static void main(String[] args) {
		//建立一个数组,并进行赋值
		int[] arry = new int[] {2,3,4,5,6};
		System.out.println("插入之前的操作："+Arrays.toString(arry));
		int index=2;//设置下标索引值
		int element = 9;//设置插入的值
		//再创建一个新数组，并且将其长度设置为原数组的长度加一
		int[] newArray = new int[arry.length+1];
		for(int i =0;i<arry.length;i++) {
			//接下来对原数组的元素进行筛选操作
			if(i<index) {
				newArray[i]=arry[i];
			}else {
				//当i=时，将其空出。之后的位置继续由原数组复制添加进来
				newArray[i+1]=arry[i];
			}
		}
		//将新数组下标为index的空元素进行填补。就是插入操作
		newArray[index] = element;
        //将原数组用新数组进行替换
		arry = newArray;
		
		System.out.println("笔者在3和4之间插入一个9");
		
		System.out.println("插入后的数组："+Arrays.toString(arry));//将数组转为字符串输出。
	}

}
