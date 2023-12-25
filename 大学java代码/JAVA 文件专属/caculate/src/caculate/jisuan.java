package caculate;

public class jisuan {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for(int i=0;i<20;i++) {
			for (int j=0;j<100;j++) {
				int sum =i*j;
			System.out.println("i*j="+sum);
			}
		}
		long endTime = System.currentTimeMillis();
        System.out.println("耗时："+(endTime-startTime));
	}

}
