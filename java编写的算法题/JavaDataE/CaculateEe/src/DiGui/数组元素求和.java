package DiGui;

public class 数组元素求和 {

	public static void main(String[] args) {
		int [] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int y=arrs(arr,0);
		System.out.println(y);

	}
	public static int arrs(int[] arr,int begin) {
		//设置出口，当递归到最后一个元素时，返回最后一个元素
		if(begin==arr.length-1) {
			return arr[begin];
		}
		return arr[begin]+arrs(arr,begin+1);
	}

}
