package themes;

public class Telephone {

	public static void main(String[] args) {
		int[] arr = new int[] {1,0,7,6,5,4,3,9};
		int [] index = new int[] {0,4,3,1,2,0,5,4,3,6,7};
		String tel=" ";
		for(int i: index) {
			tel +=arr[i];
			
		}
		System.out.println("µç»°£º"+tel);

	}

}
