package Chazhao;

public class test {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		//定义一个目标元素
		int target = 1;
		//定义一个开始元素
		int begin =0;
		//记录最后一个元素
		int end =arr.length-1;
		//定义一个中间位置
		int mid = (begin+end)/2;
		//定义目标元素的索引值
		int index =-1;
		//循环查找
		while(true) {
			if(arr[mid]==target) {//进行匹配查找
				index =mid;
				break;
			}else {
				if(arr[mid]>target) {//如果中间的元素比目标元素大
					end = mid-1;//重新定义末尾值
				}else {//如果中间元素小于目标元素
					begin = mid +1;//重新定义开始值
				}
				//重新取出中间值
				mid=(begin+end)/2;
			}
		}
		System.out.println("目标元素的索引值为："+index);

	}

}
