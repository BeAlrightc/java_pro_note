package demo1.util;

import java.util.Arrays;

public class MyArray {

	//用于存储数据的数组
	private int[] elements;
	//创建构造器，用于初始化
	public MyArray() {
		elements = new int[0];
		
	}
	
	//获取数组长度的方法
	public int size() {
		return elements.length;
	}
	
	//往数组的末尾添加一个元素
	public void add(int element) {
		//创建一个新数组，其长度值为原来的数组长度加一
		int [] newArr = new int[elements.length+1];
		//把原来的数组中元素加到新数组当中
		for(int i=0;i<elements.length;i++) {
			newArr[i] = elements[i];
		}
		//把添加的元素放入新数组当中
		newArr[elements.length] =element;
		//使用新数组替换旧数组
		elements = newArr;
	}
	//在数组中删除一个元素
	public void Delete(int dst) {//dst表示数组下标值
		//判断数组下标是否越界
		if(dst <0 ||dst>elements.length-1) {
			throw new RuntimeException("下标越界");
		}		
		//创建一个新的数组.其长度为原来的数组减一
		 int [] newArr = new int[elements.length-1];
		 for(int i=0;i<newArr.length;i++) {
			 if(i<dst) {
				 newArr[i] = elements[i]; 
			 }else {
				 newArr[i] = elements[i+1];
			 }
		 }
		 elements =newArr;
	}
	//获取某个元素
	public int get(int index) {
		return elements[index];
	}
	
	//插入一个元素到指定位置
	public void insert(int index,int element) {
		//创建一个新的数组其长度应该为原数组长度加一
		int[] newArr = new int[elements.length+1];
		//将原数组中的元素放入新数组中
		for(int i=0;i<elements.length;i++) {
			//目标位置之前的元素
			if(i<index) {
				newArr[i]=elements[i];
			}else {
				newArr[i+1] = elements[i];
			}
		}
		//插入新的元素
		newArr[index]=element;
		//替换旧数组
		elements =newArr;
	}
	//打印所有元素到控制台
	public void show() {
		System.out.println(Arrays.toString(elements));
	}
	//线性查找
	public int search(int target) {
		//遍历数组
		for(int i =0;i<elements.length-1;i++) {
			if(elements[i]==target) {
				return i;
			}
		}
		return -1;
	}
	//二分法查找
	public int binarySearch(int target) {
		//目标元素
				
				//记录开始位置
				int begin =0;
				//记录结束的位置
				int end = elements.length-1;
				//记录中间的位置
				int mid =(begin+end)/2;
				//记录目标元素的位置
				int index =-1;
				//循环查找，先让他循环下去
				while(true) {
					//判断中间的元素是不是要查找的元素
					if(elements[mid]==target) {
						return mid;
						//中间这个元素不是要查找的元素
					}else {
						//判断中间的这个元素是不是比目标元素大
						if(elements[mid]>target) {
							//把结束位置调到中间位置的前一个位置
							end = mid-1;
							//中间元素比目标元素小
						}else {
							//把开始位置调整到中间后一个位置
							begin =mid+1;
							
						}
						//取出新的中间位置
						mid = (begin+end)/2;
					}
				}	
	}
	//二分法升级版
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
	public static void main(String[] args) { 
		//获取一个可变的数组
			MyArray ma = new MyArray();
			//获取长度
			int size = ma.size();
			System.out.println(size);
			ma.show();
			//往可变数组中添加一个元素、
			ma.add(10);
			ma.add(98);
		
			System.out.println(ma.size());
			ma.show();
			//调用删除方法
			//ma.Delete(3);
			ma.show();
			//调用get方法获取某个元素，并将它输出打印台
			System.out.println(ma.get(1));
			//调用insert方法进行插入元素操作 
			ma.insert(2, 1000);
			ma.show();
			System.out.println(ma.ER(1000));
			System.out.println(ma.binarySearch(1000));
	}
}
