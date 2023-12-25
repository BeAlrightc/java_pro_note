package TanXin;

public class RemoveQu {

	public static void main(String[] args) {
		int [][]temp=new int[][] {{1,2,3},{4,0},{4,6,78,9}};
		for(int i=0;i<temp.length;i++) {
			for(int j=0;j<temp[i].length;j++) {
				System.out.println("temp["+i+"]["+j+"]="+temp[i][j]);
			}
		}
	}
}

