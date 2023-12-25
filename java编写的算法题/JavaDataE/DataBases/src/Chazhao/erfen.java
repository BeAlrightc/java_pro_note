package Chazhao;

public class erfen {
	//这个算法有问题，如果要查找的目标元素不在该数组里面的话会出现死循环

	public static void main(String[] args) {
		//目标数组
		int[] arr = new int[] {1,2,3,4,5,6,7,8};
		//目标元素
		int target =9;
		//记录开始位置
		int begin =0;
		//记录结束的位置
		int end = arr.length-1;
		//记录中间的位置
		int mid =(begin+end)/2;
		//记录目标元素的位置
		int index =-1;
		//循环查找，先让他循环下去
		while(true) {
			//判断中间的元素是不是要查找的元素
			if(arr[mid]==target) {
				index =mid;
				break;
				//中间这个元素不是要查找的元素
			}else {
				//判断中间的这个元素是不是比目标元素大
				if(arr[mid]>target) {
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
		System.out.println("index的值为："+index);

	}

}
 