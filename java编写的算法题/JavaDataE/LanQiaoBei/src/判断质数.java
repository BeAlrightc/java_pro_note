
public class ÅĞ¶ÏÖÊÊı {

	public static void main(String[] args) {
		System.out.println(judgePrime(31));
	

	}
	public static boolean judgePrime(int num) {
		boolean flag=true;
		if(num==1 || (num %2 ==0 && num !=2)) {
			flag=false;
		}else {
			for(int j=3;j<=Math.sqrt(num);j+=2) {
				if(num%j==0) {
					flag=false;
				}
			}
		}
		return flag;
	}
}
