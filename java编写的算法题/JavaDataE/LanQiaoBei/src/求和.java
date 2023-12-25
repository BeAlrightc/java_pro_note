
public class ÇóºÍ {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=2019;i++) {
			String n =i+"";
			if(n.contains("2")||n.contains("0")||n.contains("1")||n.contains("9")) {
				sum+=i;
			}
		}
System.out.println(sum);
	}

}
