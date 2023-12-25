package ShuZu;

public class erfen {

	public static void main(String[] args) {
		//定义一个数组
		int[] array = new int[] {1,2,3,4,5,6,7,8};
		//定义一个开始
		int begin =0;
		//定义一个末尾值
		int end =array.length-1;
		//定义一个目标查询值
		int dst =4;
		//定义一个索引值
		int index=-1 ;
		while(begin <= end) {
			int mid = (begin + end)/2;
			if(array[mid]==dst)	{
				index =mid;
				break;
			}else {
				if(array[mid]<dst) {
					end=mid-1;
				}else {
					begin=mid +1;
				}
			}
		}
		System.out.println("该索引值为："+index);
	}
}
