package lan2016;

public class the1 {

	public static void main(String[] args) {
		int Bi=777;
		int []arr = new int[] {1,0,1,0,1,0,1,0,1,0,1,0,1,1,0};//转数组遍历
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				Bi *=2;
			}else {
				Bi-=555;
			}
		}
		System.out.println(Bi);

	}

}
