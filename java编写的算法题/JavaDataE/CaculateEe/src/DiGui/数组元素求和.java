package DiGui;

public class ����Ԫ����� {

	public static void main(String[] args) {
		int [] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int y=arrs(arr,0);
		System.out.println(y);

	}
	public static int arrs(int[] arr,int begin) {
		//���ó��ڣ����ݹ鵽���һ��Ԫ��ʱ���������һ��Ԫ��
		if(begin==arr.length-1) {
			return arr[begin];
		}
		return arr[begin]+arrs(arr,begin+1);
	}

}
