package ShuZu;

import java.util.Arrays;

public class MyArray {
	//用于存储的数组
	private int[] elements;

	//添加一个构造方法
	public MyArray() {
		//进行初始化操作
		elements = new int[0];
	}
	//获取数组长度的的方法
	public int size() {
		return elements.length;
	}
	public void show() {
		System.out.println(Arrays.toString(elements));
	}
	//往数组的末尾添加一个元素
	public void add(int element) {
		//创建一个新的数组，使其长度比原有数组加一
		int[] newArray = new int[elements.length+1];
		for(int i= 0;i<elements.length;i++) {
			//将原数组中的元素加入新数组当中
			newArray[i]=elements[i];
		}
		//新加入一个元素
		newArray[elements.length]=element;
		//使用新数组替换旧数组
		elements =newArray;
		
	}
	//删除数组中的元素
	public void delete(int index) {
		//判断下标是否越界
		if(index <0 || index > elements.length-1) {
			throw new RuntimeException("下标越界");			
		}else {
		//创建一个新的数组，长度为原数组减一
		int[] newArray =new int[elements.length-1];
		for(int i=0;i<newArray.length;i++ ) {
			if(i<index) {
				newArray[i]=elements[i];	
				//想要删除的元素的后面的元素
			}else {
				newArray[i]=elements[i+1];
			}
		}	
		//将新数组替换旧数组
		elements= newArray;
	}		
  }
	//获取某个数组
	public int get(int index) {
		return elements[index];
	}
	//插入某个元素
	public void insert(int index,int element) {
		 //创建一个新数组其长度为原数组加一
		int[] newArray =new int[elements.length+1];
		for(int i=0;i<elements.length;i++) {
			if(i<index) {
				newArray[i] =elements[i];
			}else {
				newArray[i+1]=elements[i];
			}
			newArray[index]=element;
		}
		elements = newArray;
	}
	//线型查找
	public int XianF(int dst) {
		for(int i=0;i<elements.length;i++) {
			if(elements[i]==dst) {
				return i;
			}
		}
		//当没有这个数时
		return -1;
	}
	//二分法查找
	public int ER(int dst) {
		int begin=0;
		int end = elements.length-1;
		while(begin<=end) {
			int mid =(begin + end)/2;
			if(elements[mid]==dst) {
				return mid;
			}else {
				if(elements[mid]<dst) {
					begin = mid +1;
				}else {
					end = mid-1;
				}
			}
			
		}
		return -1;
		
	}
}
