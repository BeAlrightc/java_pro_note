
public class excesies {

	public static void main(String[] args) {
		int woman=0;
		for(int i=0;i<100;i++) {
			if(i%2==0) {
				woman=i/2;
				if(i+20==(woman+20)*1.5) {
					woman+=20;
					System.out.println(woman);
					break;
				}
			}
		}

	}

}
