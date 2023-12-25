package DiGui;

public class knowingDiGui {

	public static void main(String[] args) {
		System.out.println(f(10));

	}
	static int f(int i) {
		if(i==0) {
			return 0;
		}
		//自身调用自身
	return i+f(i-1);	
  }
	
	

 
}
